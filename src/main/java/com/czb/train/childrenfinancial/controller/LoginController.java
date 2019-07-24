package com.czb.train.childrenfinancial.controller;

import com.czb.train.childrenfinancial.entity.UserInf;
import com.czb.train.childrenfinancial.service.RedisService;
import com.czb.train.childrenfinancial.service.UserService;
import com.czb.train.childrenfinancial.vo.LoginParamVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: LoginController
 * @Description: 用户登录、注册
 * @Author: hhj
 * @Date: 2019/7/24
 * @Version: 0
 */
@RestController
@Slf4j
@RequestMapping("/auth")
public class LoginController {
    @Autowired
    private RedisService redisService;

    @Autowired
    UserService userService;

    /**
     * 登录授权
     * @param authorizationUser
     * @return
     */
//    @Log("用户登录")
    @PostMapping(value = "/login")
    public UserInf login(@Validated @RequestBody LoginParamVO loginParamVO) {
        UserInf userInf = userService.login(loginParamVO);
        return userInf;

//        // 查询验证码
//        String code = redisService.getCodeVal(loginParamVO.getUuid());
//        // 清除验证码
//        redisService.delete(loginParamVO.getUuid());
//        if (StringUtils.isBlank(code)) {
//            throw new BadRequestException("验证码已过期");
//        }
//        if (StringUtils.isBlank(loginParamVO.getCode()) || !loginParamVO.getCode().equalsIgnoreCase(code)) {
//            throw new BadRequestException("验证码错误");
//        }
//        final JwtUser jwtUser = (JwtUser) userDetailsService.loadUserByUsername(loginParamVO.getUserName());
//
//        if(!jwtUser.getPassword().equals(EncryptUtils.encryptPassword(loginParamVO.getPassword()))){
//            throw new BadRequestException("密码错误");
//        }
//
//        if(!jwtUser.isEnabled()){
//            throw new AccountExpiredException("账号已停用，请联系管理员");
//        }
//
//        // 生成令牌
//        final String token = JwtTokenUtil.generateToken(jwtUser);
//
//        // 返回 token
//        return ResponseEntity.ok(new AuthenticationInfo(token,jwtUser));
    }
}
