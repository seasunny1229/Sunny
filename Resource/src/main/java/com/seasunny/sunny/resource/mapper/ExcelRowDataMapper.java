package com.seasunny.sunny.resource.mapper;

import com.seasunny.sunny.resource.model.ExcelRowDataModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExcelRowDataMapper {

    int insertRow(@Param("excelRowData") ExcelRowDataModel excelRowDataModel);

}
