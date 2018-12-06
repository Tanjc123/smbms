package com.zl.smbms.pojo;

public class Smbms_role {
  private Long id;
  private String rolecode;
  private String rolename;
  private Long createdby;
  private java.sql.Timestamp creationdate;
  private Long modifyby;
  private java.sql.Timestamp modifydate;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRolecode() {
    return rolecode;
  }

  public void setRolecode(String rolecode) {
    this.rolecode = rolecode;
  }

  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

  public Long getCreatedby() {
    return createdby;
  }

  public void setCreatedby(Long createdby) {
    this.createdby = createdby;
  }

  public java.sql.Timestamp getCreationdate() {
    return creationdate;
  }

  public void setCreationdate(java.sql.Timestamp creationdate) {
    this.creationdate = creationdate;
  }

  public Long getModifyby() {
    return modifyby;
  }

  public void setModifyby(Long modifyby) {
    this.modifyby = modifyby;
  }

  public java.sql.Timestamp getModifydate() {
    return modifydate;
  }

  public void setModifydate(java.sql.Timestamp modifydate) {
    this.modifydate = modifydate;
  }
}
