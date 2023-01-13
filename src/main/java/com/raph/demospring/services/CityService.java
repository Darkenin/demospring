package com.raph.demospring.services;

import com.raph.demospring.entities.Geo.City;
import com.raph.demospring.entities.Geo.Country;
import com.raph.demospring.pojo.CityRequest;
import com.raph.demospring.repo.geoRepo.CityRepo;
import com.raph.demospring.repo.geoRepo.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepo cityRepo;

    @Autowired
    CountryRepo countryRepo;
    public CityService() {
    }

    public List<City> getCities(){
        return cityRepo.findAll();
    }

    public City saveCity(City city) {
       return cityRepo.save(city);
    }

    public City getCity(String cityname) {
        return cityRepo.findByCityName(cityname);
    }

    public City addcity(CityRequest cityRequest) {
        Country country = countryRepo.findById(cityRequest.country_id);
        City city = new City();
        city.setCityName(cityRequest.cityname);
        city.setCity_code(cityRequest.citycode);
        city.setCountry(country);
        return cityRepo.save(city);
    }
}
