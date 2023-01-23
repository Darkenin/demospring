package com.raph.demospring.repo;


import com.raph.demospring.entities.Sms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmsRepository extends JpaRepository<Sms,Integer> {
    
}
