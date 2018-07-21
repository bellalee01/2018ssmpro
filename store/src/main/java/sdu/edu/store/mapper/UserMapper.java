package sdu.edu.store.mapper;

import sdu.edu.store.entity.User;

public interface UserMapper {
	int addUser(User user);

	User findUserByName(String name);

	User findUserByEmail(String email);
}
