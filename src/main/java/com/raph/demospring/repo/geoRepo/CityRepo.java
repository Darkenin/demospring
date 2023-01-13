package com.raph.demospring.repo.geoRepo;

import com.raph.demospring.entities.Geo.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<City, Long> {

    City findByCityName(String city_name);

}
