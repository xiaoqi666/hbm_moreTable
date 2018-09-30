package com.xiaoqi.test;

import com.xiaoqi.domain.CstLinkmanEntity;
import com.xiaoqi.domain.CustomerEntity;
import com.xiaoqi.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * 注意点:
 * 项目编码,数据库编码,表编码一致
 */
public class Main {
    @Test
    //一对多
    public void test() {
        Session session = HibernateUtils.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();

        //创建一
        CustomerEntity c = new CustomerEntity();
        c.setCustName("笑傲江湖");

        //创建多
        CstLinkmanEntity cle1 = new CstLinkmanEntity();
        cle1.setLkmName("风清扬");
        CstLinkmanEntity cle2 = new CstLinkmanEntity();
        cle2.setLkmName("林青霞");

        //表达一对多
        c.getLinksmans().add(cle1);
        c.getLinksmans().add(cle2);

        //表达多对一
        cle1.setCustomerEntity(c);
        cle2.setCustomerEntity(c);

        session.save(c);
        session.save(cle1);
        session.save(cle2);

        transaction.commit();
        session.close();
    }
}
