package com.raph.demospring.repo.sms;


import com.raph.demospring.entities.sms.Inbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InboxRepository extends JpaRepository<Inbox,Integer> {
    
}
