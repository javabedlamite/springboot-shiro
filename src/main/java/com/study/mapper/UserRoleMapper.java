package com.study.mapper;

import java.util.List;

import com.study.model.UserRole;
import com.study.util.MyMapper;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}