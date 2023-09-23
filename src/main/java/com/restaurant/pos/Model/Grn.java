package com.restaurant.pos.Model;

import javax.persistence.*;

@Entity
@Table(name = "grn")
public class Grn {

    public Grn() {
    }

    public Grn(Integer id, Integer supplierId, String billNo, String dateGrn, String discount, Double totalAmount) {
        this.id = id;
        this.supplierId = supplierId;
        this.billNo = billNo;
        this.dateGrn = dateGrn;
        this.discount = discount;
        this.totalAmount = totalAmount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "supplierId")
    private Integer supplierId;

    @Column(name = "billNo")
    private String billNo;

    @Column(name = "grnDate")
    private String dateGrn;

    @Column(name = "discount")
    private String discount;

    @Column(name = "totalAmount")
    private Double totalAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getDateGrn() {
        return dateGrn;
    }

    public void setDateGrn(String dateGrn) {
        this.dateGrn = dateGrn;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Grn{" +
                "id=" + id +
                ", supplierId=" + supplierId +
                ", billNo='" + billNo + '\'' +
                ", dateGrn='" + dateGrn + '\'' +
                ", discount='" + discount + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
