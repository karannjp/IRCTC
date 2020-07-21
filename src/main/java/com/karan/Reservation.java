package com.karan;

public class Reservation {
    private String firstName;
    private String lastName;
    private  String Gender;
    private  String[] food;
    private  String cityfrom;
    private  String cityto;

    public Reservation()
    {
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setFood(String[] food) {
        this.food = food;
    }

    public String[] getFood() {
        return food;
    }

    public String getGender() {
        return Gender;
    }

    public void setCityfrom(String cityfrom) {
        this.cityfrom = cityfrom;
    }

    public void setCityto(String cityto) {
        this.cityto = cityto;
    }

    public String getCityfrom() {
        return cityfrom;
    }

    public String getCityto() {
        return cityto;
    }
}
