package sdu.edu.store.service;

import sdu.edu.store.entity.User;
import sdu.edu.store.service.ex.PasswordException;
import sdu.edu.store.service.ex.UserExistException;
import sdu.edu.store.service.ex.UserNameException;

public interface IUserService {
	/**
	 * 注册用户
	 * @param name
	 * @param password
	 * @param confirm
	 * @param email
	 * @param mobile
	 * @throws UserExistException 用户名已经存在
	 * @throws PasswordException  密码错误, 不合乎规则
	 */
	void regist(String name, String password, String confirm, String email, String mobile) 
			throws UserExistException, PasswordException;

	boolean existUser(String name);

	boolean existEmail(String email);

	User login(String name, String password) throws PasswordException, UserNameException; 
}
