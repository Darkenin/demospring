package com.raph.demospring.controller;


import com.raph.demospring.entities.sms.Failed;
import com.raph.demospring.entities.sms.Inbox;
import com.raph.demospring.entities.sms.Other;
import com.raph.demospring.entities.sms.Sent;
import com.raph.demospring.services.SmsService;
import com.raph.demospring.entities.Sms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sms/")
public class SmsController {
    
    @Autowired
    SmsService smsService;

    @PostMapping("addtoinbox")
    public Inbox addToInbox(@RequestBody Inbox inbox){
        return smsService.addToInbox(inbox);
    }

    @PostMapping("addtosent")
    public Sent addToSent(@RequestBody Sent sent){
        return smsService.addToSent(sent);
    }

    @PostMapping("addtofailed")
    public Failed addToFailed(@RequestBody Failed failed){
        return smsService.addToFailed(failed);
    }

    @GetMapping("inbox")
    public List<Inbox> fetchInbox(){
        return smsService.fetchInbox();
    }

    @GetMapping("others")
    public List<Other> fetchOthers(){
        return smsService.fetchOthers();
    }

    @GetMapping("allsms")
    public List<Sms> allSms(){
        return smsService.fetchAll();
    }
}
