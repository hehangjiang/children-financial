package com.czb.train.childrenfinancial.service;

import com.czb.train.childrenfinancial.entity.UserInf;
import com.czb.train.childrenfinancial.vo.LoginParamVO;

/**
 * @ClassName: LoginService
 * @Description:
 * @Author: hhj
 * @Date: 2019/7/24
 * @Version: 0
 */
public interface UserService {
    UserInf login(LoginParamVO user);
}
