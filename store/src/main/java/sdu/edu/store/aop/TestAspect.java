package sdu.edu.store.aop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.concurrent.LinkedBlockingQueue;

import javax.annotation.PostConstruct;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAspect {
	
	private File file;
	private LinkedBlockingQueue<String> queue = new LinkedBlockingQueue<String>(1000);
	private Thread writeFile;
	
	@PostConstruct
	public void init(){
		file = new File("/Users/lixuefei/Desktop/2018daneissm/lxfff/log.txt");
		writeFile = new Thread(){
			@Override
			public void run() {
				while(true){
					try{
						String log = queue.take(); //消费数据
						PrintWriter out = new PrintWriter(new FileOutputStream(file, true)); //追加方式写文件					
						out.println(log);
						out.close();
						System.out.println("写出log:"+log); 
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		};
		writeFile.start();
	}
	

	/**
	 * 环绕通知： 在目标业务方法之前之后调用
	 */
	@Around("bean(*Service)")
	public Object test(ProceedingJoinPoint joinPoint) throws Throwable{
		
		//获取当前业务方法的方法签名（方法名+参数类型列表）
		Signature signature = joinPoint.getSignature();
		
		long t1 = System.nanoTime();
		Object val = joinPoint.proceed(); //执行最终的业务方法， login() regist() list() ....
		long t2 = System.nanoTime();
		long t = t2-t1;//t代表业务方法执行消耗的时间
		System.out.println(signature+"-"+t);
		queue.put("方法："+signature+" 时间："+t);  //生产数据
		return val;
	}
	
	
}

