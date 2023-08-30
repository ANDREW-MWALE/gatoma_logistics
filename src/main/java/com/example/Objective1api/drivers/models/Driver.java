package com.example.Objective1api.drivers.models;

import jakarta.persistence.*;

@Entity
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Fname;
    private String Lname;
    private String Email;
    private String Address;
    private String Nrc;
    private String Phone;
    private String phoneNumber;
    private String License;

    public Driver() {
    }

    public Driver(String fname,
                  String lname,
                  String email,
                  String address,
                  String nrc,
                  String phone,
                  String phoneNumber,
                  String license) {
        Fname = fname;
        Lname = lname;
        Email = email;
        Address = address;
        Nrc = nrc;
        Phone = phone;
        License = license;
    }

    public String getLicense() {
        return License;
    }

    public void setLicense(String license) {
        License = license;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getNrc() {
        return Nrc;
    }

    public void setNrc(String nrc) {
        Nrc = nrc;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}

//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//}
