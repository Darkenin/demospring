package com.raph.demospring.entities.Geo;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cities")
public class City {

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    // des describes hw the column data will be created
    @Column(name = "city_code", columnDefinition = "character varying(3) not null default 'NA' ")
    private String city_code;

    @Column(name = "country_id")
    private int country_id;

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    //the insertable and updatable param allows you to skip the Country mapped field ie id
    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false) // which column in city table holds the primary key to the country table
    private Country country;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String city_code) {
        this.city_code = city_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return getId().equals(city.getId()) && getCityName().equals(city.getCityName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCityName());
    }
}
