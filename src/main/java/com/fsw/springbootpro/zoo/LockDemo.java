package com.fsw.springbootpro.zoo;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * Curator实现分布式锁
 */
public class LockDemo {
    public static final String connectStr = "192.168.21.128:2181,192.168.21.129:2181,192.168.21.130:2181";

    public static void main(String[] args) {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(connectStr).
                sessionTimeoutMs(50000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        //创建锁
        InterProcessMutex lock = new InterProcessMutex(curatorFramework,"/locks");

        for (int i = 0; i <10 ; i++) {
           new Thread(()->{
               try {
                   System.out.println(Thread.currentThread().getName()+"尝试获取锁");
                   lock.acquire();
                   System.out.println(Thread.currentThread().getName()+"获取了锁");
               } catch (Exception e) {
                   e.printStackTrace();
               }
               try {
                   Thread.sleep(4000);
                   lock.release();
                   System.out.println(
                           Thread.currentThread().getName()+"释放了锁"
                   );
               } catch (Exception e) {
                   e.printStackTrace();
               }
           }).start();
        }
    }
}

