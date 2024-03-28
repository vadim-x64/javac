package com.example.p_encapsulation;

public class Person {

     private String name;

     private int age;

     private String lastName;

     private double height;

     private String job;

     // getter - це метод, який призначений для отримання
     // значення приватного поля об'єкта
     public String getName() {
          return name;
     }

     // this - цей клас
     // setter - це метод, якому ми говоримо, що треба знайти
     // в цьому класі поле, яке називається name і записати туди
     // вказане значення name
     public void setName(String name) {
          this.name = name;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getLastName() {
          return lastName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public double getHeight() {
          return height;
     }

     public void setHeight(double height) {
          this.height = height;
     }

     public String getJob() {
          return job;
     }

     public void setJob(String job) {
          this.job = job;
     }
}