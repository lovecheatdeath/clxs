package com.clxs.service.serviceImpl;

import com.clxs.mapper.AccountMapper;
import com.clxs.pojo.Account;
import com.clxs.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account selectByUsernameAndPassword(String username,String password){
        Account account=new Account();
        account.setUsername(username);
        account=accountMapper.selectByUsernameAndPassword(account);
    if(account != null &&account.getPassword().equals(password)){
        return account;
    }
    return null;
    }
}
