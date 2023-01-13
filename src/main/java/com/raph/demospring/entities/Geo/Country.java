package com.raph.demospring.entities.Geo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id ")
    private int country_id;

    @Column(name = "country_name")
    private String country_name;

    @OneToMany
    @JsonIgnore
    @JoinColumn(name = "country_id")
    private Set<City> cities;
    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountryname() {
        return country_name;
    }

    public void setCountryname(String countryname) {
        this.country_name = countryname;
    }


}
