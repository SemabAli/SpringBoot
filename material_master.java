package com.operaize.api.model;

import javax.persistence.*;

@Entity
@Table(name = "MATERIAL_MASTER")
public class material_master {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "itemCode")
    private String itemCode;

    @Column(name = "uom")
    private String uom;

    @Column(name = "itemDesc")
    private String itemDesc;

    @Column(name = "grade")
    private String grade;

    @Column(name = "lifeDays")
    private String lifeDays;

    @Column(name = "itemType")
    private String itemType;

    public material_master() {

    }

    public material_master(String itemCode, String uom, String itemDesc, String grade, String lifeDays, String itemType) {
        this.itemCode = itemCode;
        this.uom = uom;
        this.itemDesc = itemDesc;
        this.grade = grade;
        this.lifeDays = lifeDays;
        this.itemType = itemType;
    }

    public long getId() {
        return id;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getLifeDays() {
        return lifeDays;
    }

    public void setLifeDays(String lifeDays) {
        this.lifeDays = lifeDays;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @Override
    public String toString() {
        return "material_master [itemId=" + id + ", itemCode=" + itemCode + ", uom=" + uom + ", itemDesc=" + itemDesc + ", grade=" + grade + ", lifeDays=" + lifeDays + ", itemType=" + itemType +"]";
    }
}