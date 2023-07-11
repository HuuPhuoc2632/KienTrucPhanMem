package com.example.baitap1javafx.Model;

import java.io.Serializable;

public class Patient implements Serializable {
    public String msbn, cmnd, hoTen, diaChi, noiDungKham;

    public String getMsbn() {
        return msbn;
    }

    public void setMsbn(String msbn) {
        this.msbn = msbn;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNoiDungKham() {
        return noiDungKham;
    }

    public void setNoiDungKham(String noiDungKham) {
        this.noiDungKham = noiDungKham;
    }

    public Patient(String msbn, String cmnd, String hoTen, String diaChi, String noiDungKham) {
        this.msbn = msbn;
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.noiDungKham = noiDungKham;
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "msbn='" + msbn + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", noiDungKham='" + noiDungKham + '\'' +
                '}';
    }
}
