package com.example.javaexamwebstoresportswear.dto;

public class UserDTO
{
    private String fullName;
    private String email;
    private String city;
    private String country;
    private String phone;
    public UserDTO() {}
    public UserDTO(String fullName, String email, String city, String country, String phone)
    {
        this.fullName = fullName;
        this.email = email;
        this.city = city;
        this.country = country;
        this.phone = phone;
    }
    public String getFullName()
    {
        return fullName;
    }
    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
}