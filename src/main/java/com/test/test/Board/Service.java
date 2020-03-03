//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.test.test.Board;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "request_table"
)
public class Service implements Serializable {
    @Id
    @Column(
            name = "order_id"
    )
    private String order_id;
    @Column(
            name = "order_date"
    )
    private String order_date;
    @Column(
            name = "amount"
    )
    private String amount;
    @Column(
            name = "unit_price"
    )
    private String unit_price;
    @Column(
            name = "currency"
    )
    private String currency;
    @Column(
            name = "name"
    )
    private String name;
    @Column(
            name = "phone"
    )
    private String phone;
    @Column(
            name = "email"
    )
    private String email;
    @Column(
            name = "address_1"
    )
    private String address_1;
    @Column(
            name = "address_2"
    )
    private String address_2;
    @Column(
            name = "post"
    )
    private String post;

    public Service() {
    }

    public String getOrder_id() {
        Date from = new Date();
        SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.order_date = transFormat.format(from);
        return this.order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_date() {
        return this.order_date;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnit_price() {
        return this.unit_price;
    }

    public void setUnit_price(String unit_price) {
        this.unit_price = unit_price;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress_1() {
        return this.address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return this.address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
