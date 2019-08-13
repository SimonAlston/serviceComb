package com.itheima.jvm;


import org.junit.Test;

import java.util.ArrayList;
import java.util.UUID;

public class JVMtest {
    @Test
    public void testJVM(){
        ArrayList<String> lists = new ArrayList<>();
        for (int i = 0; i <1000000 ; i++) {
            String str= "";
            for (int j = 0; j <100 ; j++) {
                str+= UUID.randomUUID().toString();
            }
            lists.add(str);
        }
        System.out.println("ok");

    }
}
