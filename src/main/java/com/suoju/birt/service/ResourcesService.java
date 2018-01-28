package com.suoju.birt.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageInfo;
import com.suoju.birt.model.Resources;

/**
 * Created by zhaowu on 2018/1/27
 */
public interface ResourcesService extends IService<Resources> {
    PageInfo<Resources> selectByPage(Resources resources, int start, int length);

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}
