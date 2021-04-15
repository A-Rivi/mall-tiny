package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.mbg.model.Test01;
import com.macro.mall.tiny.service.Test01Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 品牌管理Controller
 * Created by macro on 2019/4/19.
 */
@Api(tags = "PmsBrandController", description = "商品品牌管理")
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private Test01Service test01Service;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Test01> getBrandList() {
        Test01 test01 = test01Service.getById(1);
        return CommonResult.success(test01);
    }
    @ApiOperation("测试")
    @RequestMapping(value = "test1", method = RequestMethod.GET)
    @ResponseBody
    public void test1() {
        System.out.println(this.hashCode());
    }
    @ApiOperation("测试2")
    @RequestMapping(value = "test2", method = RequestMethod.GET)
    @ResponseBody
    public void test2() {
        System.out.println(this.hashCode());
    }
}
