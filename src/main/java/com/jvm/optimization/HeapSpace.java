package com.jvm.optimization;

/**
 * Created by Mr.PanYang on 2018/9/4.
 * <p>
 * 设置新生代比例参数
 * <p>
 * 使用示例:    -Xms20m -Xmx20m -Xmn1m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC
 * <p>
 * 说明：堆内存初始化值20m,堆内存最大值20m，新生代最大值可用1m，eden空间和from/to空间的比例为2/1
 */
public class HeapSpace {

    public static void main(String[] args) {
        byte[] b = null;
        for (int i = 0; i < 10; i++) {
            b = new byte[1 * 1024 * 1024];
        }
    }

}
