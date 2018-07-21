package sdu.edu.store.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import sdu.edu.store.entity.User;
import sdu.edu.store.mapper.UserMapper;
import sdu.edu.store.service.IUserService;
import sdu.edu.store.service.ex.PasswordException;
import sdu.edu.store.service.ex.ServiceException;
import sdu.edu.store.service.ex.UserExistException;
import sdu.edu.store.service.ex.UserNameException;

@Service
public class UserService implements IUserService {
	
	@Value("#{cfg.salt}")
	private String salt;

	@Resource
	private UserMapper userMapper;
	
	public void regist(String name, String password, String confirm, String email, String mobile)
			throws UserExistException, PasswordException {
		//trim()是去掉前后空格的意思
		//按照“合理”的业务逻辑实现代码
		if(name==null || name.trim().isEmpty()){
			throw new ServiceException("用户名不能为空！");
		}
		if(password==null || password.trim().isEmpty()){
			throw new PasswordException("密码不能为空");
		}
		if(! password.equals(confirm)){
			throw new PasswordException("确认密码不一致");
		}
		if(email==null || email.trim().isEmpty()){
			throw new ServiceException("Email 不能为空");
		}
		//....
		User user = userMapper.findUserByName(name);
		if(user!=null){
			throw new UserExistException("用户名已经注册！");
		}
		Date date = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = fmt.format(date);
		String pwd = DigestUtils.md5Hex(password+salt);
		user = new User(null, name, pwd, email, mobile, 0, name, time, name, time);
		int n = userMapper.addUser(user);
		if(n!=1){
			throw new ServiceException("数据保存异常："+n);
		}

	}

	public boolean existUser(String name) {
		User user = userMapper.findUserByName(name);
		return user != null;
	}

	public boolean existEmail(String email) {
		User user = userMapper.findUserByEmail(email);
		return user != null;
	}

	public User login(String name, String password) throws PasswordException, UserNameException{
		if(name==null || name.trim().isEmpty()){
			throw new ServiceException("用户名不能为空！");
		}
		if(password==null || password.trim().isEmpty()){
			throw new PasswordException("密码不能为空");
		}
		User user = userMapper.findUserByName(name);
		if(user==null){
			throw new UserNameException("用户名不存在");
		}
		String pwd = DigestUtils.md5Hex(password+salt);
		
		if(pwd.equals(user.getPassword())){
			return user;
		}
		throw new PasswordException("密码不正确！");
	}

}
