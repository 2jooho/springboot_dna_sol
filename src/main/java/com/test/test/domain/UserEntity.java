package com.test.test.domain;

import java.util.HashMap;
import java.util.Map;


public class UserEntity {

    private Map<String, Object> map=new HashMap<String, Object>();

    public UserEntity(){}
    public Map<String, Object> getorder() {
        return map;
    }

    public void setorder(Map<String, Object> map) {
        this.map = map;
    }

}