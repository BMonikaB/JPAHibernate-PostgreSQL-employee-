package bazy.domain;


import javax.persistence.Embeddable;

@Embeddable
public class Dane {


    private String country;
    private String city;
    private String street;
    private String phoneNumber;

    public Dane(String country, String city, String street, String phoneNumber) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private Dane(){};
    @Override
    public String toString() {
        return "Dane{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
