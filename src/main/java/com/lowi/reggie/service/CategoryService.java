package com.lowi.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lowi.reggie.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
