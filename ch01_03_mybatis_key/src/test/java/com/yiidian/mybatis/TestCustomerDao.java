package com.yiidian.mybatis;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import com.yiidian.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * MyBatis测试类
 * 一点教程网 - www.yiidian.com
 */
public class TestCustomerDao {

    /**
     * 添加-通过selectkey标签获取自增主键值
     */
    @Test
    public void testSave1(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.生成Dao代理对象
        CustomerDao customerDao = session.getMapper(CustomerDao.class);

        //3.调用save方法
        Customer customer = new Customer();
        customer.setName("小苍");
        customer.setGender("女");
        customer.setTelephone("15755556666");

        System.out.println("插入数据前："+customer);

        customerDao.save1(customer);

        System.out.println("插入数据后："+customer);

        //4.关闭连接
        session.close();
    }


    /**
     * 添加-通过useGeneratedKeys属性获取自增主键值
     */
    @Test
    public void testSave2(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.生成Dao代理对象
        CustomerDao customerDao = session.getMapper(CustomerDao.class);

        //3.调用save方法
        Customer customer = new Customer();
        customer.setName("小泽");
        customer.setGender("女");
        customer.setTelephone("13422223333");

        System.out.println("插入数据前："+customer);

        customerDao.save2(customer);

        System.out.println("插入数据后："+customer);

        //4.关闭连接
        session.close();
    }
}
