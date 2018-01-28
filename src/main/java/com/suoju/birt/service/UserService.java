package com.suoju.birt.service;

import com.github.pagehelper.PageInfo;
import com.suoju.birt.model.User;

/**
 * Created by zhaowu on 2018/1/27
 */
public interface UserService extends IService<User>{
    PageInfo<User> selectByPage(User user, int start, int length);

    User selectByUsername(String username);

    void delUser(Integer userid);

}
