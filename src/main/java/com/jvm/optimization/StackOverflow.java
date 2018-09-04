package com.jvm.optimization;

/**
 * Created by Mr.PanYang on 2018/9/4.
 * <p>
 * 栈溢出
 * <p>
 * 错误原因: java.lang.StackOverflowError  栈内存溢出
 * 栈溢出 产生于递归调用，循环遍历是不会的，但是循环方法里面产生递归调用， 也会发生栈溢出。
 * <p>
 * 解决办法:设置线程最大调用深度      -Xss5m   设置最大调用深度
 */
public class StackOverflow {
    private static int count;

    public static void count() {
        try {
            count++;
            count();
        } catch (Throwable e) {
            System.out.println("最大深度:" + count);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        count();
    }

}
