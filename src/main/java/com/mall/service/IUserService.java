package com.mall.service;

import com.mall.common.ServerResponse;
import com.mall.pojo.User;

/**
 * @ Author: 陌北有棵树
 * @ Date: 2018/1/10 19:15
 * @ Description:
 */

/*无论是静态代理，动态代理，AOP都是接口代理，
* 也可用CGlib代理，但接口的扩展性强*/
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetResetPassword(String username,String passwordNew,String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld,String passwordNew,User user);

    ServerResponse<User> updateInformation(User user);

    ServerResponse<User> getInformation(Integer userId);

    ServerResponse checkAdminRole(User user);

}
