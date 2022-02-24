package com.pudding.pp.util;

public class IdUtil {
    private static SnowflakeIdWorker snowflakeIdWorker;

    public IdUtil() {
    }

    public static String generatorId() {
        return getSnowflakeIdWorker().nextId() + "";
    }

    public synchronized static SnowflakeIdWorker getSnowflakeIdWorker() {
        if (snowflakeIdWorker == null) {
                snowflakeIdWorker = new SnowflakeIdWorker(1L, 1L);
        }
        return snowflakeIdWorker;
    }
}
