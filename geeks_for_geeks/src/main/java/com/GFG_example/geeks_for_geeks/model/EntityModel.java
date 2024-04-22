package com.GFG_example.geeks_for_geeks.model;
//this class is same as orderModel;
//and this class work as bridge which connect our model to our database tablel;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("orders")
public class EntityModel {
    @Id
    @Column("ID")
    public long id;
    @Column("ORDER_NUMBER")
    public String orderNo;
    @Column("PRODUCT_NAME")
    public  String productName;
    @Column("PRICE")
    public float price;
    @Column("QTY")
    public int quantity;

    public EntityModel(long id, String orderNo, String productName, int quantity, float price) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

//    we need a parameterless constructor for mapping library , we will use later;
    public EntityModel(){

    }
    @Override
    public String toString() {
        return "OrderModel{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
