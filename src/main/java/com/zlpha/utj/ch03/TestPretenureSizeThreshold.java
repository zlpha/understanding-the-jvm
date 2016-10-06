package com.zlpha.utj.ch03;

/**
 * java -cp target/classes/ -XX:+PrintGCDetails -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 com.zlpha.utj.ch03.TestPretenureSizeThreshold
 */
public class TestPretenureSizeThreshold {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allocation;
        allocation = new byte[4 * _1MB];  //直接分配在老年代中
    }

}
