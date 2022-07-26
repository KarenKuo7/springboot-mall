package com.kuokaren.springbootmall.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

//接收前端回傳參數 並 驗證參數
public class UserRegisterRequest {

    @NotBlank
    @Email    //email格式檢查
    private String email;
    @NotBlank
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
