package com.test.test.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gene_table")

public class gene implements Serializable {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long userId;
   // @Id
    @Column(name = "name_gene")
    private String name_gene;
    @Column(name = "ref")
    private String ref;
    @Column(name = "risk")
    private String risk;
    @Column(name = "genotype")
    private String genotype;
    @Column(name = "marker_result")
    private String marker_result;

    @ManyToOne
    @JoinColumn(name="barcode",referencedColumnName = "barcode")
    private Disease disease1;
    @ManyToOne
    @JoinColumn(name="order_id",referencedColumnName = "order_id")
    private Disease disease2;
    public gene(){}
    public gene(String name_gene, String ref, String risk, String genotype, String marker_result, Disease disease1,Disease disease2) {
        this.name_gene=name_gene;
        this.ref=ref;
        this.risk=risk;
        this.genotype=genotype;
        this.marker_result=marker_result;
        this.disease1=disease1;
        this.disease2=disease2;
}

    public String getname_gene() {
        return name_gene;
    }
 public void setUserId(long userId) {
     this.userId = userId; }
    public String getref() {
        return ref;
    }
    public String getrisk() {
        return risk;
    }

    public String getgenotype() {
        return genotype;
    }
    public String getmarker_result() {
        return marker_result;
    }

    public Disease getdisease1() {
        return disease1;
    }
    public Disease getdisease2() {
        return disease2;
    }

}

