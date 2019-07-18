package com.fsw.springbootpro.zoo;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;
import sun.management.StackTraceElementCompositeData;

/**
 * Curator操作zookeeper
 */
public class CuratorDemo {
    public static final String connectString = "192.168.21.128:2181,192.168.21.129:2181,192.168.21.130:2181";
    public static void main(String[] args) throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(connectString).
                sessionTimeoutMs(50000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        //增加节点
        //creatData(curatorFramework);
        //修改节点
       // updateData(curatorFramework);
        //删除节点
        deleteData(curatorFramework);

    }


    private static void creatData(CuratorFramework curatorFramework) throws Exception {
        curatorFramework.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/data/program","test".getBytes());
    }

    private static void updateData(CuratorFramework curatorFramework) throws Exception {
        curatorFramework.setData().forPath("/data/program","up".getBytes());
    }

    private static void deleteData(CuratorFramework curatorFramework) throws Exception {
        //获取节点的state信息
        Stat Stat = new Stat();
        //将节点的信息存储到stat中
        String s = new String(curatorFramework.getData().storingStatIn(Stat).forPath("/data/program"));
        System.out.println(s);
        //根据stat信息中的版本号进行删除
        curatorFramework.delete().withVersion(Stat.getVersion()).forPath("/data/program");
    }
}
