package com.suoju.birt.mapper;

import java.util.List;
import java.util.Map;

import com.suoju.birt.model.Resources;
import com.suoju.birt.util.MyMapper;

public interface ResourcesMapper extends MyMapper<Resources> {

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}