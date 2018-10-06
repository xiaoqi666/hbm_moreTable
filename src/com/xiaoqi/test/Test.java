package com.xiaoqi.test;

import com.xiaoqi.domain.SysRole;
import com.xiaoqi.domain.SysUserEntity;
import com.xiaoqi.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 多对多
 */
public class Test {
    @org.junit.Test
    public void test() {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        //创建两个User
        SysUserEntity user1 = new SysUserEntity();
        user1.setUserName("令狐冲1");
        SysUserEntity user2 = new SysUserEntity();
        user2.setUserName("令狐冲2");

        SysRole role1 = new SysRole();
        role1.setRoleName("笑傲江湖1");
        SysRole role2 = new SysRole();
        role2.setRoleName("笑傲江湖2");

        user1.getRoles().add(role1);
        user1.getRoles().add(role2);
        user2.getRoles().add(role1);
        user2.getRoles().add(role2);

        role1.getUsers().add(user1);
        role1.getUsers().add(user2);
        role2.getUsers().add(user1);
        role2.getUsers().add(user2);
        session.save(user1);
        session.save(user2);
        session.save(role1);
        session.save(role2);

        transaction.commit();
        session.close();
    }


}
