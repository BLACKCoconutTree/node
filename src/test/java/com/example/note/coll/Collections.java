package com.example.note.coll;


import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
//        1.集合分为两组(单列集合,双列集合)
//        单列集合 Collection接口有三个重要的子接口List,Set, Queue
//        双列集合 Map接口的实现子类是双列集合,存放键值对Key and Value
//

        // 要求：用LinkedHashMap实现LRU（最近最少使用）缓存，容量为3
//        class LRUCache<K, V> extends LinkedHashMap<K, V> {
//            @Override
//            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
//                return size() > 3; // 当大小超过3时移除最老元素
//            }
//        }
// 测试用例：
//        LRUCache<String, Integer> cache = new LRUCache<>();
//        cache.put("A", 1); cache.put("B", 2); cache.put("C", 3);
//        cache.get("A");    // 访问A使其成为最新
//        cache.put("D", 4); // 此时B被移除
    }
}
