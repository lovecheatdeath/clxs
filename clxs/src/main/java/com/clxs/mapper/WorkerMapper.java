package com.clxs.mapper;

import com.clxs.pojo.Worker;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkerMapper {
    List<Worker> list();

    List<Worker> list(Worker worker);

    Worker selectByParentId(Worker parentId);

    List selectWithoutChild(List ids);


    boolean deleteByPrimaryKey(Integer integer);

    boolean insert(Worker worker);

    boolean insertSelective(Worker worker);

    List selectByNameOrArticle(@Param("keyword") String keyword);

    boolean updateByPrimaryKeySelective(Worker worker);

    boolean updateByPrimaryKey(Worker worker);

    boolean downLoadsWorker(List ids);
}