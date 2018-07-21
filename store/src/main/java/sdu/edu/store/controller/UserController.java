package sdu.edu.store.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import sdu.edu.store.entity.User;
import sdu.edu.store.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@Resource 
	IUserService userService;
	
	@RequestMapping("/regist.do")
	@ResponseBody // Spring MVC 提供的注解，作用是将返回值自动填充到 相应的Body中。
	// 当返回值是JavaBean时候，就自动转换为 JSON 字符串（就是JSON对象）
	public Result regist(String name, String password, String confirm, String email, String mobile, ModelMap map){
		try{
			userService.regist(name, password, confirm, email, mobile);
			System.out.println("regist()"); 
			return new Result("成功");
		}catch(Exception e){
			e.printStackTrace();
			map.put("message", e.getMessage());
			return new Result(e); 
		}
		
	}
	@RequestMapping("/checkName.do")
	@ResponseBody
	public Result checkName(String name){
		if(userService.existUser(name)){
			return new Result(Result.ERROR, "用户已经存在", null);
		}else{
			return new Result(Result.SUCCESS, "检查通过", null);
		}
	}
	
	@RequestMapping("/checkEmail.do")
	@ResponseBody
	public Result checkEmail(String email){
		if(userService.existEmail(email)){
			return new Result(Result.ERROR, "邮箱已经存在", null);
		}else{
			return new Result(Result.SUCCESS, "检查通过", null);
		}
	}
	
	@RequestMapping("/login.do")
	@ResponseBody
	public Result login(String name, String password, HttpSession session){
		User user = userService.login(name, password);
		//将登录用户信息保存到Session中
		session.setAttribute("loginUser", user); 
		return new Result("登录成功!");
	}
	
	
	/**
	 * 接收文件上载
	 */
	@RequestMapping(value="/upload.do", method=RequestMethod.POST)
	@ResponseBody
	public Result upload(String name, MultipartFile image1, MultipartFile image2 )
		throws IOException {
		
		System.out.println(name);
		
		String file1 = image1.getOriginalFilename();
		String file2 = image2.getOriginalFilename();
		
		File dir = new File("E:/upload");
		dir.mkdir();
			
		image1.transferTo(new File(dir, file1));
		image2.transferTo(new File(dir, file2));
		
		return new Result("OK");
	}
	/**
	 * 接收文件上载
	 */
	@RequestMapping(value="/upload2.do", method=RequestMethod.POST)
	@ResponseBody
	public Result upload2(String name, MultipartFile[] images )
		throws IOException {
		
		System.out.println(name);
		
		File dir = new File("E:/upload");
		dir.mkdir();
			
		for (MultipartFile multipartFile : images) {
			String file = multipartFile.getOriginalFilename();
			multipartFile.transferTo(new File(dir, file));
		}
		 
		return new Result("OK");
	}
	
}
