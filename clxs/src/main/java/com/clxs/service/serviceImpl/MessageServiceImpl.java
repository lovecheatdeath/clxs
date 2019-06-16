package com.clxs.service.serviceImpl;

import com.clxs.mapper.MessageMapper;
import com.clxs.pojo.Message;
import com.clxs.pojo.Product;
import com.clxs.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    //获取某个作品的所有上架留言
    @Override
    public List<Message> getMessageByProduct(@Param("productId") Integer productId){
        Boolean status=true;
        return messageMapper.selectMessage(productId,status);
    }

    //获取留言列表
    public List<Message> getMessageList(){
        return messageMapper.list();
    }


    //获取单个留言
    @Override
    public Message getMessageById(Integer id){
        return messageMapper.selectMessage(id);
    }

    //获取所有上架留言
    public List<Message> getMessageByStatus(){
        Boolean status=true;
        return messageMapper.selectMessage(status);
    }


    @Override
    public boolean insertMessage(Message message){
        return messageMapper.insert(message);
    }

    @Override
    public boolean deleteMessageById(Integer id){
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean updateMessage(Message message){
        return messageMapper.updateByPrimaryKey(message);
    }

    //获取所有留言指出所属作品
/*    @Override
    public boolean getMessageByProductId()*/
}
