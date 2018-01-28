package com.suoju.birt.mapper;

import java.util.List;

import com.suoju.birt.model.Role;
import com.suoju.birt.util.MyMapper;

public interface RoleMapper extends MyMapper<Role> {
    public List<Role> queryRoleListWithSelected(Integer id);
}