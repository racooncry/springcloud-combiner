package com.shenfeng.yxw.storageservice.repository;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.shenfeng.yxw.storageservice.entity.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
@Mapper
@Repository
public interface StorageDAO extends BaseMapper<Storage> {

}
