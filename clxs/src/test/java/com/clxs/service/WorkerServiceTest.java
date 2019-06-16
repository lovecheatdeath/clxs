package com.clxs.service;

import com.clxs.pojo.Worker;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class WorkerServiceTest extends TestCase {
    @Autowired
    WorkerService workerService;

    Worker worker=new Worker();

    @Test
    public void testStatus(){
        Boolean status=new Boolean(true);
        System.out.println(workerService.getByStatus(status));
    }
    @Test
    public void testGetId(){
        Integer integer=new Integer(1);
        System.out.println(workerService.getById(integer));

    }
    @Test
    public void testlistid(){
        Integer id=new Integer(1);
        System.out.println(workerService.listid(id));
    }

    @Test
    public void testLoad(){
        worker.setId(2);
        worker.setStatus(false);

        System.out.println(workerService.changeStatus(worker));
    }

    @Test
    public  void testSelectWithOutChild(){
        System.out.println(workerService.upLordWork());
    }
    @Test
    public void testSelectAll() {
        List list = workerService.list();
        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            worker = (Worker) list.get(i);
            System.out.println(worker);
        }

    }
}