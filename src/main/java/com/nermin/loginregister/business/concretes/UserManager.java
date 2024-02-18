package com.nermin.loginregister.business.concretes;

import com.nermin.loginregister.business.abstracts.UserService;
import com.nermin.loginregister.core.utilities.results.*;
import com.nermin.loginregister.dataAccess.UserDao;
import com.nermin.loginregister.entities.User;
import com.nermin.loginregister.dto.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class UserManager implements UserService {
    private UserDao userDao;
    @Override
    public DataResult<User> login(String userName, String password) {
User user=this.userDao.findByUserNameAndPassword(userName,password); if (user == null) {
        return new ErrorDataResult<>("Bele bir data yoxdur");
    } else {
        return new SuccessDataResult<>("Daxil olundu", user);
    }

    }

    @Override
    public Result register(User user) {
        String password=user.getPassword();
        if(password.length()>8) {
            this.userDao.save(user);
            return new SuccessResult("Melumatlar save olundu");
        }
        else {
            return new ErrorDataResult<>("Zeif koddur,zehmet olmasa yeniden yazin");
        }
    }
}
