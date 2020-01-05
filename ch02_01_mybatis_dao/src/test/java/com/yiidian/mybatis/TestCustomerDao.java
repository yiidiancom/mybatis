package com.yiidian.mybatis;

import com.yiidian.dao.CustomerDao;
import com.yiidian.dao.impl.CustomerDaoImpl;
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
 * MyBatis测试类 - 传统Dao写法
 * 一点教程网 - www.yiidian.com
 */
public class TestCustomerDao {

    /**
     * 添加
     */
    @Test
    public void testSave(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = new CustomerDaoImpl();

        //3.调用save方法
        Customer customer = new Customer();
        customer.setName("小苍");
        customer.setGender("女");
        customer.setTelephone("15755556666");
        customerDao.save(customer);


        //4.关闭连接
        session.close();
    }

    /**
     * 修改
     */
    @Test
    public void testUpdate(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = new CustomerDaoImpl();

        //3.调用update方法
        Customer customer = new Customer();
        customer.setId(5);
        customer.setName("小泽");
        customer.setGender("女");
        customer.setTelephone("15755556666");
        customerDao.update(customer);

        session.commit();

        //4.关闭连接
        session.close();
    }

    /**
     * 查询所有
     */
    @Test
    public void testFindAll(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = new CustomerDaoImpl();

        //3.调用findAll方法
        List<Customer> list = customerDao.findAll();

        for(Customer cust:list){
            System.out.println(cust);
        }

        //4.关闭连接
        session.close();
    }

    /**
     * 查询一个
     */
    @Test
    public void testFindById(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = new CustomerDaoImpl();

        //3.调用findById方法
        Customer customer = customerDao.findById(3);

        System.out.println(customer);

        //4.关闭连接
        session.close();
    }

    /**
     * 条件查询
     */
    @Test
    public void testFindByName(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = new CustomerDaoImpl();

        //3.调用findByName方法
        List<Customer> list = customerDao.findByName("%小%");

        for(Customer cust:list){
            System.out.println(cust);
        }

        //4.关闭连接
        session.close();
    }

    /**
     * 删除
     */
    @Test
    public void testDelete(){
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = new CustomerDaoImpl();

        //3.调用findByName方法
        customerDao.delete(5);

        // 提交事务
        session.commit();

        //4.关闭连接
        session.close();
    }
}
