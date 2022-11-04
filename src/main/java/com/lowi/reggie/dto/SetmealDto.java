package com.lowi.reggie.dto;

import com.lowi.reggie.entity.Setmeal;
import com.lowi.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
