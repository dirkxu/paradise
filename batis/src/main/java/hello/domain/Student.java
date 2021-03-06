package hello.domain;

import java.io.Serializable;

public class Student implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer studId;
  private String name;
  private String email;
  private PhoneNumber phone;
  private Address address;

  public Student() {
    // do nothing
  }
  
  public Student(Integer studId) {
    this.studId = studId;
  }

  public Student(Integer studId, String name, String email, PhoneNumber phone, Address address) {
    this.studId = studId;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.address = address;
  }

  public Integer getStudId() {
    return studId;
  }

  public void setStudId(Integer studId) {
    this.studId = studId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PhoneNumber getPhone() {
    return phone;
  }

  public void setPhone(PhoneNumber phone) {
    this.phone = phone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public static long getSerialversionuid() {
    return serialVersionUID;
  }

  @Override
  public String toString() {
    return "Student [studId=" + studId + ", name=" + name + ", email=" + email + ", phone=" + phone
        + ", address=" + address + "]";
  }
}
