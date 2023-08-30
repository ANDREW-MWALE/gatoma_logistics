package com.example.Objective1api.drivers.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="drivers")
public class Driver {
private Long id;
private String Fname;
private String Lname;
private String Address;
private String Nrc;
private String Phone;
private String phoneNumber;


}
