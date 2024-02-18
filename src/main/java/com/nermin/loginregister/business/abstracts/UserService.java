package com.nermin.loginregister.business.abstracts;

import com.nermin.loginregister.core.utilities.results.DataResult;
import com.nermin.loginregister.core.utilities.results.Result;
import com.nermin.loginregister.entities.User;
import com.nermin.loginregister.dto.UserDTO;


public interface UserService {
    Result register(User user);
    DataResult<User> login(String userName, String password);


}
