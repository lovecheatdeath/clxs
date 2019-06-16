package com.clxs.mapper;

import com.clxs.pojo.Account;

import java.security.SecureRandom;

public interface AccountMapper {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Account account);

    boolean insertSelective(Account account);

    Account selectByPrimaryKey(Integer id);

    Account selectByUsernameAndPassword(Account username);

    boolean updateByPrimaryKeySelective(Account account);

    boolean updateByPrimaryKey(Account account);


}