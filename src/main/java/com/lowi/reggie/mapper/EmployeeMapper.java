package com.lowi.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lowi.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee>{
}
