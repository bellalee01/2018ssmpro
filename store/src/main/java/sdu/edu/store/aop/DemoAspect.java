package sdu.edu.store.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
 
import org.springframework.stereotype.Component;


@Component
@Aspect  //聲明切面組件
public class DemoAspect {

	//在業務方法之前執行
	//在userService的全部業務方法之前執行 demo ()方法
	@Before("bean(userService) || bean(goodsService) || bean(goodsCategoryService)")
	public void demo(){
		System.out.println("Hello World!"); 
	}
	
	//在业务方法之后，无论是否出现异常都执行
	@After("bean(userService) || bean(goodsService) || bean(goodsCategoryService)")
	public void demoAfter(){
		System.out.println("demoAfter!"); 
	}
	//在业务方法出异常之后
	@AfterThrowing("bean(userService) || bean(goodsService) || bean(goodsCategoryService)")
	public void demoThrowing(){
		System.out.println("demoThrowing!"); 
	}
	//在业务方法正常执行之后
	@AfterReturning("bean(userService) || bean(goodsService) || bean(goodsCategoryService)")
	public void demoReturning(){
		System.out.println("@AfterReturning!"); 
	}

}
