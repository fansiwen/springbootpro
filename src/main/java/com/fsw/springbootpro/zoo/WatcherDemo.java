package com.fsw.springbootpro.zoo;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.curator.framework.recipes.cache.PathChildrenCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;

/**
 * Curator操作Zookeeperper监听事件
 */
public class WatcherDemo {
    public static final String connectString = "192.168.21.128:2181,192.168.21.129:2181,192.168.21.130:2181";
    public static void main(String[] args) throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(connectString).
                sessionTimeoutMs(50000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        //addListenerWithNode(curatorFramework);
        addChildrenListenerWithNode(curatorFramework);
        System.in.read();
    }

    /**
     * 当前节点的监听
     * @param curatorFramework
     * @throws Exception
     */
    public static void addListenerWithNode(CuratorFramework curatorFramework) throws Exception {
        NodeCache nodeCache = new NodeCache(curatorFramework,"/watch",false);
        NodeCacheListener nodeCacheListener = ()->{
            System.out.println("receive Node Changed");
            System.out.println(nodeCache.getCurrentData().getPath()+"-----"+new String(nodeCache.getCurrentData().getData()));
        };
        nodeCache.getListenable().addListener(nodeCacheListener);
        nodeCache.start();
    }

    /**
     * 当前节点子节点的监听
     * @param curatorFramework
     * @throws Exception
     */
    public static void addChildrenListenerWithNode(CuratorFramework curatorFramework) throws Exception {
        PathChildrenCache nodeCache = new PathChildrenCache(curatorFramework,"/watch",true);
        PathChildrenCacheListener nodeCacheListener = (curatorFramework1,pathChildrenCacheEvent)->{
            System.out.println("receive Node Changed");
            System.out.println(pathChildrenCacheEvent.getType()+"-----"+new String(pathChildrenCacheEvent.getData().getData()));
        };
        nodeCache.getListenable().addListener(nodeCacheListener);
        nodeCache.start(PathChildrenCache.StartMode.NORMAL);
    }
}
