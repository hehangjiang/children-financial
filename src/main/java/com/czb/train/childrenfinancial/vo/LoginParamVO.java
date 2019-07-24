package com.czb.train.childrenfinancial.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author cjbi
 */
@ApiModel("登录请求参数")
@Getter
@Setter
public class LoginParamVO {

    @ApiModelProperty("用户名")
    @NotNull
    String userName;

    @ApiModelProperty("密码")
    @NotNull
    String password;

    private String uuid = "";

    //验证码
    private String code;

}