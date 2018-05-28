package com.spay.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadDemo {
    ReentrantReadWriteLock rwLock=new ReentrantReadWriteLock();

    public String write(){

        Map map = new HashMap<>();
        Map.Entry entry=new Map.Entry() {
            @Override
            public Object getKey() {
                return null;
            }

            @Override
            public Object getValue() {
                return null;
            }

            @Override
            public Object setValue(Object value) {
                return null;
            }
        };
        try{
            rwLock.writeLock();
        }finally {

        }


        return "";
    }



}
