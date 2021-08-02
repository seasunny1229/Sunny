package com.seasunny.sunny.resource.model;

import com.seasunny.sunny.common.model.GenericModel;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class ExcelRowDataModel extends GenericModel {

    private int id;

    private String excelName;

    private String sheetName;

    private HashMap<String, Object> data;

    private int categoryId;
}
