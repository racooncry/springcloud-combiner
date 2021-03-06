package com.shenfeng.yxw.storageservice.controller;


import com.shenfeng.yxw.storageservice.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Program Name: springcloud-nacos-seata
 * <p>
 * Description:
 * <p>
 *
 * @author zhangjianwei
 * @version 1.0
 * @date 2019/8/28 4:05 PM
 */
@RestController
@RequestMapping("storage")
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 减库存
     *
     * @param commodityCode 商品代码
     * @param count         数量
     * @return
     */
    @RequestMapping(path = "/deduct")
    public Boolean deduct(String commodityCode, Integer count) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        storageService.deduct(commodityCode, count);
        return true;
    }

}
