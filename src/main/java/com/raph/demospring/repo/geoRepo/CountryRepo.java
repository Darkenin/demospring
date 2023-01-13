package com.raph.demospring.repo.geoRepo;

import com.raph.demospring.entities.Geo.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {

    Country findById(int country_id);

}
