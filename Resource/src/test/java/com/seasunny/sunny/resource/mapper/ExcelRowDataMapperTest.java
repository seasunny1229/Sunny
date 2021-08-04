package com.seasunny.sunny.resource.mapper;

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
        int count = excelRowDataMapper.insertRow("abc","abcd");
        log.info("finish: " + count);
    }
}
