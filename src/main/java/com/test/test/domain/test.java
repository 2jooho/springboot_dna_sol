package com.test.test.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_table")
public class test implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long userId;

    @Column(name = "order_id")
    // @NotEmpty(message="Name is Required")
    private String order_id;


    @Column(name = "barcode")
  //  @NotEmpty(message="Email is Required")
  //  @Email(message="Email format not valid")
    private String barcode;


    @Column(name = "download_url")
   // @Digits(message="Only Numbers Are Allowed", fraction = 0, integer = 10)
    private String download_url;

   @OneToMany(mappedBy="test",cascade = CascadeType.ALL)
    private List<Disease> diseaselist=new ArrayList<>();


    public test(){
    }

    public test(String order_id, String barcode, String download_url) {
    this.order_id=order_id;
    this.barcode=barcode;
    this.download_url=download_url;
    }

    public void setDisease(List<Disease> diseaselist) {
        this.diseaselist = diseaselist;
    }
    public List<Disease> getDisease() {
        return diseaselist;
    }
    public void addDisease(Disease disease){
        this.diseaselist.add(disease);
    }


    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getorder_id() {
        return order_id;
    }
    public String getbarcode() {
        return barcode;
    }
    public String getdownload_url() {
        return download_url;
    }



}