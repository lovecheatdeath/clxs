package com.clxs.service.serviceImpl;

import com.clxs.mapper.WorkerMapper;
import com.clxs.pojo.Worker;
import com.clxs.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerMapper workerMapper;

    Worker worker=new Worker();

    List ids=new ArrayList();


    @Override
    public List<Worker> list(){
        return workerMapper.list();
    }

    @Override
    public List<Worker> getByStatus(Boolean status){
        worker.setStatus(status);
        List<Worker> list=workerMapper.list(worker);
        return list;
    }

    @Override
    public Worker getById(Integer integer){
        worker.setId(integer);

//        List list=new ArrayList();
//        list.add(worker);
        List list=workerMapper.list(worker);
        Worker worker=(Worker) list.get(0);
        return worker;

    }

    @Override
    public List getByNameArticle(String keyword){
        return workerMapper.selectByNameOrArticle(keyword);
    }

    @Override
    public boolean insertSelective(Worker worker){
        return workerMapper.insertSelective(worker);
    }

    @Override
    public boolean deleteById(Integer integer){
        worker.setParentId(integer);
        worker=workerMapper.list(worker).get(0);
        if(worker!=null){
            return workerMapper.deleteByPrimaryKey(integer);
        }else
            return false;
    }

    @Override
    public boolean changeStatus(Worker worker){
        if(worker.getStatus()== true){
            return workerMapper.updateByPrimaryKeySelective(worker);
        }else {
            List ids=listid(worker.getId());
            ids.add(worker.getId());
            return workerMapper.downLoadsWorker(ids);
        }
    }

    @Override
    public List listid(Integer id){
        worker.setParentId(id);
        List<Worker> list=workerMapper.list(worker);
        if(list !=null){
            for (int i=0;i<list.size();i++){
                List list1=new ArrayList();
                list1.add(list.get(i).getId());
                ids.add(list.get(i).getId());
                for(Iterator iterator=list1.iterator();iterator.hasNext();){
                    listid((Integer) iterator.next());
                }
            }
        }
        else {return null;}
        return ids;
    }
    @Override
    public List upLordWork(){
        List list=workerMapper.list();
        List list1=new ArrayList();
        for(int i=0;i<list.size();i++){
            worker=(Worker) list.get(i);
           list1.add(worker.getParentId());
            }
        return workerMapper.selectWithoutChild(list1);
    }
}
