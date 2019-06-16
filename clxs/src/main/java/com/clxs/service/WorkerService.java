package com.clxs.service;

import com.clxs.pojo.Worker;

import java.util.List;

public interface WorkerService {
    //展示所有工作室的列表
    List<Worker> list();

    //展示上架的工作室列表
    List<Worker> getByStatus(Boolean status);

    //查询一条工作室列表
    Worker getById(Integer integer);

    //根据或内容模糊查询
    List getByNameArticle(String keyword);

    //新增一个工作室
    boolean insertSelective(Worker worker);

    //删除一个工作室
    boolean deleteById(Integer integer);

    //上架或下架工作室
    boolean changeStatus(Worker worker);

    //根据父节点查找所有子节点
    List listid(Integer id);

    //获取除最后一级的所有上架
    List upLordWork();

}