package com.clxs.mapper;

import com.clxs.pojo.Message;
import com.clxs.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Message record);

    boolean insertSelective(Message record);

    Message selectMessage(Integer id);

    List selectMessage(@Param("status")Boolean status);

    boolean updateByPrimaryKeySelective(Message record);

    boolean updateByPrimaryKey(Message record);

    List<Message> selectMessage(@Param("productId")Integer productId,@Param("status")Boolean status);

    List<Message> list();
}