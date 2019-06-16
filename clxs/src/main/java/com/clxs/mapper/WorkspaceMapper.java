package com.clxs.mapper;

import com.clxs.pojo.Workspace;

public interface WorkspaceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workspace record);

    int insertSelective(Workspace record);

    Workspace selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workspace record);

    int updateByPrimaryKey(Workspace record);
}