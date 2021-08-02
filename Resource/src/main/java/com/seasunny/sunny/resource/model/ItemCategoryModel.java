package com.seasunny.sunny.resource.model;

import com.seasunny.sunny.common.model.GenericModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ItemCategoryModel extends GenericModel {

    private int id;

    private int parentId;

    private String name;

    private boolean isRoot;


}
