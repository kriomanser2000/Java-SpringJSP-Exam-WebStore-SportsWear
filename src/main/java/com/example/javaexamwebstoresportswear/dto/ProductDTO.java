package com.example.javaexamwebstoresportswear.dto;

public class ProductDTO
{
    private String name;
    private String brand;
    private String category;
    private String color;
    private String size;
    private double price;
    private String description;
    public ProductDTO() {}
    public ProductDTO(String name, String brand, String category, String color, String size, double price, String description)
    {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.color = color;
        this.size = size;
        this.price = price;
        this.description = description;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public String getSize()
    {
        return size;
    }
    public void setSize(String size)
    {
        this.size = size;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
}