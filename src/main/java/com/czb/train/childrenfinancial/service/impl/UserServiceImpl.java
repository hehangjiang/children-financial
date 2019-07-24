package com.czb.train.childrenfinancial.service.impl;

import com.czb.train.childrenfinancial.entity.UserInf;
import com.czb.train.childrenfinancial.exception.BadRequestException;
import com.czb.train.childrenfinancial.mapper.UserInfMapper;
import com.czb.train.childrenfinancial.service.RedisService;
import com.czb.train.childrenfinancial.service.UserService;
import com.czb.train.childrenfinancial.vo.LoginParamVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: hhj
 * @Date: 2019/7/24
 * @Version: 0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserInfMapper userInfMapper;

    @Autowired
    private RedisService redisService;

    @Override
    public UserInf login(LoginParamVO user) {
        // 查询验证码
        String code = redisService.getCodeVal(user.getUuid());
        // 清除验证码
        redisService.delete(user.getUuid());
        if (StringUtils.isBlank(code)) {
            throw new BadRequestException("验证码已过期");
        }
        if (StringUtils.isBlank(user.getCode()) || !user.getCode().equalsIgnoreCase(code)) {
            throw new BadRequestException("验证码错误");
        }

        UserInf userInf = userInfMapper.selectByAccount(user.getUserName());
        if (userInf == null) {
            throw new BadRequestException("账户不存在");
        }
        if (!user.getPassword().equals(userInf.getLoginPw())) {
            throw new BadRequestException("密码错误");
        }

        userInf.setLoginPw(null);

        return userInf;
    }
}
