package com.raph.demospring.services;


import com.raph.demospring.entities.Sms;
import com.raph.demospring.entities.sms.Inbox;
import com.raph.demospring.entities.sms.Other;
import com.raph.demospring.entities.sms.Sent;
import com.raph.demospring.repo.SmsRepository;
import com.raph.demospring.repo.sms.FailedRepository;
import com.raph.demospring.repo.sms.OtherRepository;
import com.raph.demospring.repo.sms.SentRepository;
import com.raph.demospring.repo.sms.InboxRepository;
import com.raph.demospring.entities.sms.Failed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmsService {

    @Autowired
    SmsRepository smsRepository;

    @Autowired
    InboxRepository inboxRepository;

    @Autowired
    SentRepository sentRepository;

    @Autowired
    FailedRepository failedRepository;

    @Autowired
    OtherRepository otherRepository;

    public SmsService(){


    }

    public Inbox addToInbox(Inbox inbox) {
        return inboxRepository.save(inbox);
    }

    public Sent addToSent(Sent sent) {
        return sentRepository.save(sent);
    }

    public Failed addToFailed(Failed failed) {
        return failedRepository.save(failed);
    }

    public List<Inbox> fetchInbox() {
        return inboxRepository.findAll();
    }

    public List<Sms> fetchAll() {
        return smsRepository.findAll();
    }

    public List<Other> fetchOthers() {
        return otherRepository.findAll();
    }
    
    
}
