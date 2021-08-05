package com.seasunny.sunny.resource.mapper;

import com.seasunny.sunny.resource.model.ExcelRowDataModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class ExcelRowDataMapperTest {

    @Autowired
    private ExcelRowDataMapper excelRowDataMapper;

    @Test
    public void insertRow() {
        ExcelRowDataModel excelRowDataModel = new ExcelRowDataModel();
        excelRowDataModel.setExcelName("abc");
        excelRowDataModel.setSheetName("def");
        int count = excelRowDataMapper.insertRow(excelRowDataModel);
        log.info("finish: " + count);
    }
}
