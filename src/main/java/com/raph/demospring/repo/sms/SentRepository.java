package com.raph.demospring.repo.sms;


import com.raph.demospring.entities.sms.Sent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SentRepository extends JpaRepository<Sent,Integer> {
    
}
