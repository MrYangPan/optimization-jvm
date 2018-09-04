package com.jvm.optimization;

/**
 * Created by Mr.PanYang on 2018/9/4.
 * <p>
 * jvm 信息，参数调优      -Xmx20m -Xms5m
 */
public class HeapMemory {

    public static void main(String[] args) {

//        使用示例:  -Xmx20m -Xms5m
//        说明： 当下Java应用最大可用内存为20M， 初始内存为5M


        byte[] b = new byte[4 * 1024 * 1024];
        System.out.println("分配了4M空间给数组");

        //堆内存信息
        System.out.println("最大内存：" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
        System.out.println("可用内存：" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
        System.out.println("已使用内存：" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
    }


}
