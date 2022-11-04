package com.lowi.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lowi.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
