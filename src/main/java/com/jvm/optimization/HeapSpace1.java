package com.jvm.optimization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr.PanYang on 2018/9/4.
 * <p>
 * 堆溢出
 * <p>
 * 解决办法:设置堆内存大小     -Xms1m -Xmx10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError
 * <p>
 * 垃圾回收机制原则：内存不足的时候会去回收，如果内存足够，暂时不会回收
 */
public class HeapSpace1 {

    public static void main(String[] args) {
        // -Xms1m -Xmx10m -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError
        List<Object> listObject = new ArrayList();
        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
            Byte[] bytes = new Byte[1 * 1024 * 1024];
            listObject.add(bytes);
        }
        System.out.println("添加成功...");
    }
}
