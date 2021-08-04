package com.seasunny.sunny.resource.mapper;

import com.seasunny.sunny.resource.model.ExcelRowDataModel;
import org.apache.ibatis.annotations.Param;

public interface ExcelRowDataMapper {

    int insertRow(@Param("excelRowDataModel") ExcelRowDataModel excelRowDataModel);

}
