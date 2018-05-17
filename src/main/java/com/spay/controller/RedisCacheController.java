package com.spay.controller;

import com.spay.bean.BankMessage;
import com.spay.service.BankMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RedisCacheController {

    @Autowired
    private BankMessageMapper bankMessageMapper;

    @RequestMapping("getMessageBank")
    public List<BankMessage> getMessageBank(String request){

        return  bankMessageMapper.getBankMessage(request);
    }


}
