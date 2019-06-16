package com.clxs.mapper;

import com.clxs.pojo.Worker;
import com.clxs.service.WorkerService;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class WorkerMapperTest extends TestCase {
    @Autowired
    WorkerMapper workerMapper;

    Worker worker=new Worker();

    @Test
    public void testLike(){
//        worker.setName("艺术");
        worker.setParentId(1);
        System.out.println(workerMapper.list(worker));

    }
    @Test
    public void testList(){
//        worker.setName("艺术");
        System.out.println(workerMapper.list());

    }
    @Test
    public void testKeyword(){
        String keyword="2";

        List list=new ArrayList();
        list=workerMapper.selectByNameOrArticle(keyword);
        System.out.println(list);
    }

    @Test
    public void testLoad(){
        List ids=new ArrayList();
        ids.add(1);
//        ids.add(2);
        ids.add(3);
        ids.add(4);
        workerMapper.downLoadsWorker(ids);

    }
    @Test
    public void testSelect(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(workerMapper.selectWithoutChild(list));
    }





}
