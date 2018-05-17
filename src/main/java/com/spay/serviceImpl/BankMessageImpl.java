package com.spay.serviceImpl;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.dubbo.rpc.protocol.dubbo.DubboInvoker;
import com.spay.bean.BankMessage;
import com.spay.service.BankMessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BankMessageImpl implements BankMessageMapper {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Cacheable(value = "wiselyKeyGenerator")
    @Override
    public List<BankMessage> getBankMessage(String request) {

        System.out.println("===========》》"+jdbcTemplate);
        try {
            System.out.println("===========================》》"+jdbcTemplate.getDataSource().getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<BankMessage> bankMessag=  jdbcTemplate.query("select * from bank_message where sub_branch_no='102100000021'",new BeanPropertyRowMapper(BankMessage.class));
        return bankMessag;
    }
}
