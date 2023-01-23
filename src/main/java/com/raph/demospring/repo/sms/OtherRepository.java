package com.raph.demospring.repo.sms;

import com.raph.demospring.entities.sms.Other;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OtherRepository extends JpaRepository<Other,Integer> {
    
}
