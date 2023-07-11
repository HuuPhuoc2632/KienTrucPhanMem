package com.example.Tuan3.Model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
@Table(name = "KhoaHoc")
public class KhoaHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String title;
    private double nativePrice;
    private double salePrice;

    @Column(nullable = true)
    private byte[] userImage;
    private String userName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getNativePrice() {
        return nativePrice;
    }

    public void setNativePrice(double nativePrice) {
        this.nativePrice = nativePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public byte[] getUserImage() {
        return userImage;
    }

    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @jakarta.persistence.Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public KhoaHoc(Long id, String name, String title, double nativePrice, double salePrice, byte[] userImage, String userName) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.nativePrice = nativePrice;
        this.salePrice = salePrice;
        this.userImage = userImage;
        this.userName = userName;
    }

    public KhoaHoc() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KhoaHoc khoaHoc)) return false;
        return Double.compare(khoaHoc.getNativePrice(), getNativePrice()) == 0 && Double.compare(khoaHoc.getSalePrice(), getSalePrice()) == 0 && Objects.equals(getId(), khoaHoc.getId()) && Objects.equals(getName(), khoaHoc.getName()) && Objects.equals(getTitle(), khoaHoc.getTitle()) && Objects.equals(getUserImage(), khoaHoc.getUserImage()) && Objects.equals(getUserName(), khoaHoc.getUserName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getTitle(), getNativePrice(), getSalePrice(), getUserImage(), getUserName());
    }

    @Override
    public String toString() {
        return "KhoaHoc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", nativePrice=" + nativePrice +
                ", salePrice=" + salePrice +
                ", userImage=" + userImage +
                ", userName='" + userName + '\'' +
                '}';
    }
}
