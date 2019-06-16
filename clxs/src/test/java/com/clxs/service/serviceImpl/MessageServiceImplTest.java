package com.clxs.service.serviceImpl;

import com.clxs.service.MessageService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class MessageServiceImplTest extends TestCase {

    @Autowired
    MessageService messageService;

    @Test
    public void testGetMessageByProduct() {

    }

    public void testGetMessageList() {
    }

    public void testGetMessageById() {
    }

    public void testInsertMessage() {
    }

    public void testDeleteMessageById() {
    }

    public void testUpdateMessage() {
    }
}