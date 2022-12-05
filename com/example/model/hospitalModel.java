package com.example.model;

public class hospitalModel {
    private String hospitalname;
    private int photo;

    public hospitalModel(String hospitalname, int photo) {
        this.hospitalname = hospitalname;
        this.photo = photo;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
