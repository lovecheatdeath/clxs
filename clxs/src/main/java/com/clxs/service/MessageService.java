package com.clxs.service;

import com.clxs.pojo.Message;
import com.clxs.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    List<Message> getMessageByProduct(@Param("productId") Integer productId);

    Message getMessageById(Integer id);

    List<Message> getMessageList();

    List<Message> getMessageByStatus(

    );

    boolean insertMessage(Message message);

    boolean deleteMessageById(Integer id);

    boolean updateMessage(Message message);


}
