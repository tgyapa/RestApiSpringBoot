package com.restaurant.pos.Model;

import javax.persistence.*;

@Entity
@Table(name = "Grn_details")
public class GrnDetails {

    public GrnDetails() {
    }

    public GrnDetails(Integer id, Integer itemId, Integer grnId, Double qty, Double lineDiscount, Double lineTotalAmount) {
        this.id = id;
        this.itemId = itemId;
        this.grnId = grnId;
        this.qty = qty;
        this.lineDiscount = lineDiscount;
        this.lineTotalAmount = lineTotalAmount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "itemId")
    private Integer itemId;

    @Column(name = "grnId")
    private Integer grnId;

    @Column(name = "qty")
    private Double qty;

    @Column(name = "lineDiscount")
    private Double lineDiscount;

    @Column(name = "lineTotalAmount")
    private Double lineTotalAmount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getGrnId() {
        return grnId;
    }

    public void setGrnId(Integer grnId) {
        this.grnId = grnId;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getLineDiscount() {
        return lineDiscount;
    }

    public void setLineDiscount(Double lineDiscount) {
        this.lineDiscount = lineDiscount;
    }

    public Double getLineTotalAmount() {
        return lineTotalAmount;
    }

    public void setLineTotalAmount(Double lineTotalAmount) {
        this.lineTotalAmount = lineTotalAmount;
    }

    @Override
    public String toString() {
        return "GrnDetails{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", grnId=" + grnId +
                ", qty=" + qty +
                ", lineDiscount=" + lineDiscount +
                ", lineTotalAmount=" + lineTotalAmount +
                '}';
    }
}
