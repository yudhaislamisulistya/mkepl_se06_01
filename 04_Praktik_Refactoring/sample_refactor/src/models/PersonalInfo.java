package models;

import java.util.Date;

public class PersonalInfo {
    private String name;
    private String phone;
    private String address;
    private String birthCity;
    private Date birthDate;

    public PersonalInfo(String name, String phone, String address, String birthCity, Date birthDate) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.birthCity = birthCity;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
