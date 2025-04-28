package com.example.note.coll;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<k,v>  extends LinkedHashMap<k,v> {


    @Override
    protected boolean removeEldestEntry(Map.Entry<k, v> eldest) {
        return size()>3;// 当大小超过3时移除最老元素
    }
}
