package com.example2.selfcheckinapp;

public class Member {
    private String name;
    private String dateofarrival;
   private String email;
   private String phonenumber;
   private String aadharno;
   private String totalmembers;
   private String age;

    public Member() {
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

    public String getDateofarrival() {
        return dateofarrival;
    }

    public void setDateofarrival(String dateofarrival) {
        this.dateofarrival = dateofarrival;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAadharno() {
        return aadharno;
    }

    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    public String getTotalmembers() {
        return totalmembers;
    }

    public void setTotalmembers(String totalmembers) {
        this.totalmembers = totalmembers;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
