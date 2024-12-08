package com.example.javaexamwebstoresportswear.dto;

import java.util.List;

public class OrderDTO
{
    private Long orderId;
    private String userEmail;
    private List<ProductDTO> products;
    private double totalPrice;
    private String orderDate;
    public OrderDTO() {}
    public OrderDTO(Long orderId, String userEmail, List<ProductDTO> products, double totalPrice, String orderDate)
    {
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.products = products;
        this.totalPrice = totalPrice;
        this.orderDate = orderDate;
    }
    public Long getOrderId()
    {
        return orderId;
    }
    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }
    public String getUserEmail()
    {
        return userEmail;
    }
    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }
    public List<ProductDTO> getProducts()
    {
        return products;
    }
    public void setProducts(List<ProductDTO> products)
    {
        this.products = products;
    }
    public double getTotalPrice()
    {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice)
    {
        this.totalPrice = totalPrice;
    }
    public String getOrderDate()
    {
        return orderDate;
    }
    public void setOrderDate(String orderDate)
    {
        this.orderDate = orderDate;
    }
}
