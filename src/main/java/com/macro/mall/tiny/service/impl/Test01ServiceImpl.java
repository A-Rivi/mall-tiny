package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.mapper.Test01Mapper;
import com.macro.mall.tiny.mbg.model.Test01;
import com.macro.mall.tiny.service.Test01Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test01ServiceImpl implements Test01Service {
    @Autowired
    Test01Mapper mapper;
    @Override
    public Test01 getById(int i) {
        return mapper.selectByPrimaryKey(1);
    }
}
