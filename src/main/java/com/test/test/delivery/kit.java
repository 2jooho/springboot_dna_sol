package com.test.test.delivery;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Delivery_table")
public class kit implements Serializable {

    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long userId;

   // @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "order_id")
    private String order_id;

    @Column(name = "barcode")
    private String barcode;

    @Column(name = "status")
    private String status;

    @Column(name = "tracking_num")
    private String tracking_num;
    public kit(){}
    public kit(String order_id, String barcode, String status, String tracking_num) {
        this.order_id = order_id;
        this.barcode=barcode;
        this.status=status;
        this.tracking_num=tracking_num;
    }
    public String getOrder_id(){
        return order_id;
    }
    public String getBarcode(){
        return barcode;
    }
    public String getStatus(){
        return status;
    }
    public String getTracking_num(){
        return tracking_num;
    }
    public long getUserId() {
       return userId;
    }
}
