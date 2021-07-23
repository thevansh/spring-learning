package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOption;
    private String favouriteLanguage;
    private String[] operatingSystem;

    public Student() {
        countryOption=new LinkedHashMap<>();
        countryOption.put("IND","INDIA");
        countryOption.put("USA","America");
        countryOption.put("AUS","Australia");
        countryOption.put("SL","SRI LANKA");
    }

    public LinkedHashMap<String, String> getCountryOption() {
        return countryOption;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
