package com.spay.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadDemo {
    ReentrantReadWriteLock rwLock=new ReentrantReadWriteLock();

    public String write(){
        try{
            rwLock.writeLock();
        }finally {

        }


        return "";
    }



}
