package com.fsw.springbootpro;

import java.util.concurrent.*;

/**
 * 公共工具类
 * @author fansiwen
 */
public class CommonUtils {
    /**
     * 根据
     * @return
     */
    public static ExecutorService getThreadPool(int poolSize){
        return new ThreadPoolExecutor(5,
                poolSize,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingDeque<>(poolSize),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
    }
}
