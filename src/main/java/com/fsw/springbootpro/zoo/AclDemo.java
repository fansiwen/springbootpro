package com.fsw.springbootpro.zoo;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.apache.zookeeper.server.auth.DigestAuthenticationProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * Zookeeper权限操作
 */
public class AclDemo {
    public static final String connectString = "192.168.21.128:2181,192.168.21.129:2181,192.168.21.130:2181";
    public static void main(String[] args) throws Exception {
        //demo1();
        demo2();
        return;
    }

    /*private static void demo1() throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(connectString).
                sessionTimeoutMs(50000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        List<ACL> list = new ArrayList<>();
        //DigestAuthenticationProvider.generateDigest(String password)
        //对密码进行加密
        ACL acl = new ACL(ZooDefs.Perms.READ | ZooDefs.Perms.WRITE,new Id("digest", DigestAuthenticationProvider.generateDigest("admin:admin")));
        list.add(acl);
        curatorFramework.create().withMode(CreateMode.PERSISTENT).withACL(list).forPath("/auth");
    }*/
    private static void demo2() throws Exception {
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(connectString).
                sessionTimeoutMs(50000).
                retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
        curatorFramework.start();
        List<ACL> list = new ArrayList<>();
        //DigestAuthenticationProvider.generateDigest(String password)
        //对密码进行加密
        ACL acl = new ACL(ZooDefs.Perms.READ | ZooDefs.Perms.WRITE,new Id("digest", DigestAuthenticationProvider.generateDigest("admin:admin")));
        list.add(acl);
        curatorFramework.setACL().withACL(list).forPath("/temp");
    }
}
