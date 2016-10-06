package com.zlpha.utj.ch03;

/**
 * java -cp target/classes/ -XX:+PrintGCDetails -XX:+UseSerialGC -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+PrintTenuringDistribution com.zlpha.utj.ch03.TestTenuringThreshold
 */
public class TestTenuringThreshold {

    private static final int _1MB = 1024 * 1024;

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];  // 什么时候进入老年代决定于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];  // 分配担保机制，进入老年代
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }

}
