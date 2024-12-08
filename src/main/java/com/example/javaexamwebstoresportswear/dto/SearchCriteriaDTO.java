package com.example.javaexamwebstoresportswear.dto;

public class SearchCriteriaDTO
{
    private String name;
    private String brand;
    private String category;
    private String color;
    private String size;
    private Double minPrice;
    private Double maxPrice;
    public SearchCriteriaDTO() {}
    public SearchCriteriaDTO(String name, String brand, String category, String color, String size, Double minPrice, Double maxPrice)
    {
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.color = color;
        this.size = size;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
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
    public Double getMinPrice()
    {
        return minPrice;
    }
    public void setMinPrice(Double minPrice)
    {
        this.minPrice = minPrice;
    }
    public Double getMaxPrice()
    {
        return maxPrice;
    }
    public void setMaxPrice(Double maxPrice)
    {
        this.maxPrice = maxPrice;
    }
}