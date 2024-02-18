package com.nermin.loginregister.dataAccess;

import com.nermin.loginregister.entities.User;
import com.nermin.loginregister.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
 User findByUserNameAndPassword(String userName,String password);
}
