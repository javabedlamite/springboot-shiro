package com.suoju.birt.mapper;

import java.util.List;

import com.suoju.birt.model.UserRole;
import com.suoju.birt.util.MyMapper;

public interface UserRoleMapper extends MyMapper<UserRole> {
    public List<Integer> findUserIdByRoleId(Integer roleId);
}