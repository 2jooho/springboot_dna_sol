package com.test.test.delivery;

import java.util.HashMap;
import java.util.Map;

public class maptype {

    private Map<String, Object> map=new HashMap<String, Object>();

public maptype(){

}

    public Map<String, Object> getorder() {
        return map;
    }

    public void setorder(Map<String, Object> map) {
        this.map = map;
    }

}