package com.bonc.thrift.dto;

import java.io.Serializable;

//从user-edge-service里移动到这个模块下
//这样其他模块，也就可以使用了
//同样定义成API
public class UserDTO implements Serializable {

    private int id;
    private String username;
    private String password;
    private String mobile;
    private String email;
    private String realName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
