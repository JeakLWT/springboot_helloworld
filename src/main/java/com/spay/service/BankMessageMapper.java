package com.spay.service;

import com.spay.bean.BankMessage;

import java.util.List;


public interface BankMessageMapper {

    List<BankMessage> getBankMessage(String request);
}
