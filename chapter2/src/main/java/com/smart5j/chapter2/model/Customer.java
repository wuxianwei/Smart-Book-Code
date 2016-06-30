package com.smart5j.chapter2.model;

/**
 * Created by miraclewong on 16/6/29.
 */
public class Customer {
    private long id;        // id
    private String name;    // 姓名
    private String contact; // 联系人
    private String telephone;// 电话号码
    private String email;   // 邮箱地址
    private String remark;  // 备注

    // Getter 和 Setter 的方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
