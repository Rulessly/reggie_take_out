package com.lowi.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lowi.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}