package com.study.mapper;

import java.util.List;

import com.study.model.Role;
import com.study.util.MyMapper;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}