package com.test.test.domain;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disease_table")
public class Disease implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long userId;

    @Column(name = "name_disease")
    private String name_disease;
    @Column(name = "result")
    private String result;
    @Column(name = "multiple_score")
    private String multiple_score;

    @ManyToOne
    @JoinColumn(name="barcode",referencedColumnName = "barcode")
    private test test;
    @ManyToOne
    @JoinColumn(name="order_id",referencedColumnName = "order_id")
    private test test2;

    @OneToMany(mappedBy="disease1",cascade = {CascadeType.ALL})

    private List<gene> genelist=new ArrayList<>();
    public Disease(){}
    public void setgene(List<gene> genelist) {
        this.genelist = genelist;
    }
    public List<gene> getgene() {
        return genelist;
    }
    public void addgene(gene gene){
        this.genelist.add(gene);
    }




    public Disease(String name_disease, String result, String multiple_score, test test1, test test2) {
        this.name_disease=name_disease;
        this.result=result;
        this.multiple_score=multiple_score;
        this.test=test1;
        this.test2=test2;
    }


    public String getName_disease() {
        return name_disease;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
    public String getResult() {
        return result;
    }



    public String getMultiple_score() {
        return multiple_score;
    }


    public test getTest() {
        return test;
    }
    public test getTest2() {
        return test2;
    }

}
