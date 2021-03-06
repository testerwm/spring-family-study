package com.yileaf.filepassword.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * ssm 百度云解压文件密码请求实体类
 *
 * @author Haotian
 * @version 1.0.0
 * @date 2020/7/4 22:26
 */
@ApiModel("用户信息")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ssm implements Serializable {
    private static final long serialVersionUID = 250225628097474478L;

    /**
     * 用户账号
     */
    @ApiModelProperty("用户账号,不能为空")
    @NotBlank(message = "请求账号不能为空")
    private String username;

    /**
     * 用户密码
     */
    @ApiModelProperty("请求密码,不能为空")
    @NotBlank(message = "请求密码不能为空")
    private String password;
}