package com.raph.demospring.repo.sms;


import com.raph.demospring.entities.sms.Failed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FailedRepository extends JpaRepository<Failed,Integer> {
    
}
