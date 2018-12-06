package com.zl.smbms.pojo;
public class Smbms_bill {
  private Long id;
  private String billcode;
  private String productname;
  private String productdesc;
  private String productunit;
  private Double productcount;
  private Double totalprice;
  private Long ispayment;
  private Long createdby;
  private java.sql.Timestamp creationdate;
  private Long modifyby;
  private java.sql.Timestamp modifydate;
  private Long providerid;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBillcode() {
    return billcode;
  }

  public void setBillcode(String billcode) {
    this.billcode = billcode;
  }

  public String getProductname() {
    return productname;
  }

  public void setProductname(String productname) {
    this.productname = productname;
  }

  public String getProductdesc() {
    return productdesc;
  }

  public void setProductdesc(String productdesc) {
    this.productdesc = productdesc;
  }

  public String getProductunit() {
    return productunit;
  }

  public void setProductunit(String productunit) {
    this.productunit = productunit;
  }

  public Double getProductcount() {
    return productcount;
  }

  public void setProductcount(Double productcount) {
    this.productcount = productcount;
  }

  public Double getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(Double totalprice) {
    this.totalprice = totalprice;
  }

  public Long getIspayment() {
    return ispayment;
  }

  public void setIspayment(Long ispayment) {
    this.ispayment = ispayment;
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

  public Long getProviderid() {
    return providerid;
  }

  public void setProviderid(Long providerid) {
    this.providerid = providerid;
  }
}
