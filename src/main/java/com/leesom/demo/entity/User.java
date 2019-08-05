package com.leesom.demo.entity;

/**
 * @author :leesom
 */
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getRealName() {
        return realName;
    }

    @Override
    public String toString() {
        return "User{"+
                "id="+id+
                "userName"+userName+
                "passWord"+passWord+
                "realName"+realName;
    }
}
