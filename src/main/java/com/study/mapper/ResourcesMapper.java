package com.study.mapper;

import java.util.List;
import java.util.Map;

import com.study.model.Resources;
import com.study.util.MyMapper;

public interface ResourcesMapper extends MyMapper<Resources> {

    public List<Resources> queryAll();

    public List<Resources> loadUserResources(Map<String,Object> map);

    public List<Resources> queryResourcesListWithSelected(Integer rid);
}