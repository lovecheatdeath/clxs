package com.clxs.service;

import com.clxs.pojo.Account;

public interface AccountService {
    Account selectByUsernameAndPassword(String username,String password);
}
