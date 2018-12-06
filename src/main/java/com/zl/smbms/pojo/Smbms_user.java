package com.zl.smbms.pojo;

public class Smbms_user {
  private Integer id;
  private String usercode;
  private String username;
  private String userpassword;
  private Integer gender;
  private java.sql.Date birthday;
  private String phone;
  private String address;
  private Integer userrole;
  private Integer createdby;
  private java.sql.Timestamp creationdate;
  private Integer modifyby;
  private java.sql.Timestamp modifydate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsercode() {
    return usercode;
  }

  public void setUsercode(String usercode) {
    this.usercode = usercode;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUserpassword() {
    return userpassword;
  }

  public void setUserpassword(String userpassword) {
    this.userpassword = userpassword;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Integer getUserrole() {
    return userrole;
  }

  public void setUserrole(Integer userrole) {
    this.userrole = userrole;
  }

  public Integer getCreatedby() {
    return createdby;
  }

  public void setCreatedby(Integer createdby) {
    this.createdby = createdby;
  }

  public java.sql.Timestamp getCreationdate() {
    return creationdate;
  }

  public void setCreationdate(java.sql.Timestamp creationdate) {
    this.creationdate = creationdate;
  }

  public Integer getModifyby() {
    return modifyby;
  }

  public void setModifyby(Integer modifyby) {
    this.modifyby = modifyby;
  }

  public java.sql.Timestamp getModifydate() {
    return modifydate;
  }

  public void setModifydate(java.sql.Timestamp modifydate) {
    this.modifydate = modifydate;
  }
}
