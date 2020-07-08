package com.example.Clothing.entity;

import javax.persistence.*;


@Table(name="Clothing_Article")
//lskdnvdosi nso ns ono ns oon
@Entity // shows this is an object class and we want this as our table class
public class Clothing_Article
{

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="id")
    private int id;

    @Column(name="first_Name")
    private String firstName;

    @Column(name="last_Name")
    private String lastName;

    @Column(name="email")
    private String email;

 public void setId(int id) {
  this.id = id;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public int getId() {
  return id;
 }

 public String getFirstName() {
  return firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public String getEmail() {
  return email;
 }
public Clothing_Article(){}
 public Clothing_Article(String firstName, String lastName, String email) {
  this.email = email;
  this.firstName = firstName;
  this.lastName = lastName;
 }

 @Override
 public String toString() {
  return "Employee{" +
          "id=" + id +
          ", firstName='" + firstName + '\'' +
          ", lastName='" + lastName + '\'' +
          ", email='" + email + '\'' +
          '}';
 }
}
