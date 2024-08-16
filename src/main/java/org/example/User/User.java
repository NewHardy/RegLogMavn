package org.example.User;

import java.io.Serializable;
import java.util.LinkedList;

public class User implements Serializable
{
    private String userName;
    private String password;
    private String role;
    private String email;
    private String birthDate;
    private String phoneNumber;
    private LinkedList<Email> mailBox=new LinkedList<>();
    public User(String userName,String password,String role,String email, String birthDate, String phoneNumber)
    {
        this.userName=userName;
        this.password=password;
        this.role=role;
        this.email=email;
        this.birthDate=birthDate;
        this.phoneNumber=phoneNumber;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.role="User";
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getRole () {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setBirthDate(String birthDate)
    {
        this.birthDate=birthDate;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    public void addMail(Email email)
    {
        this.mailBox.add(email);
    }
    public void setRole(String role)
    {
        this.role=role;
    }
    public LinkedList<Email> getMailBox()
    {
        return mailBox;
    }
}
