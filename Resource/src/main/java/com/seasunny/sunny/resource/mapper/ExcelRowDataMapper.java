package com.seasunny.sunny.resource.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ExcelRowDataMapper {

    int insertRow(@Param("excel_name") String excelName, @Param("sheet_name") String sheetName);

}
