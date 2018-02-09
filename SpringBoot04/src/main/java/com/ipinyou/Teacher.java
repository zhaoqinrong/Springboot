package com.ipinyou;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class Teacher implements Serializable{
    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettAddress() {
        return tAddress;
    }

    public void settAddress(String tAddress) {
        this.tAddress = tAddress;
    }

    public Teacher() {
    }

    public Teacher(String tName, String tAddress) {

        this.tName = tName;
        this.tAddress = tAddress;
    }

    //设置主键及生成策略,mysql默认是自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tId;
    private String tName;
    private String tAddress;

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tAddress='" + tAddress + '\'' +
                '}';
    }
}
