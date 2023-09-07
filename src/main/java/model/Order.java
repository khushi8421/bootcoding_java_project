package model;

import java.util.Date;

public class Order {
    int id;
    String deliveryAddress;
    Date orderDate;
    double amount;
    String restrauntName;
    long contact;
    String customerName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestrauntName() {
        return restrauntName;
    }

    public void setRestrauntName(String restrauntName) {
        this.restrauntName = restrauntName;
    }
}
