package com.jesper.seckill.vo;

import com.jesper.seckill.validator.IsMobile;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by jiangyunxiong on 2018/5/22.
 */
@Data
public class LoginVo {

    @NotNull
    @IsMobile  //因为框架没有校验手机格式注解，所以自己定义
    private String mobile;
    @NotNull
    private String password;
}
