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
import java.util.ArrayList;
import java.util.List;

/**
 * MyBatis测试类 - 动态SQL
 * 一点教程网 - www.yiidian.com
 */
public class TestCustomerDao {

    /**
     * if标签的使用
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testQueryByNameAndTelephone(){
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        //3.调用方法
        Customer c = new Customer();
        c.setName("%小%");

        List<Customer> list = customerDao.queryByNameAndTelephone(c);
        for (Customer customer : list) {
            System.out.println(customer);
        }


        //4.关闭连接
        sqlSession.close();
    }

    /**
     * choose标签的使用
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testQueryByNameAndTelephone2(){
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        //3.调用方法
        Customer c = new Customer();
        c.setName("%小%");

        List<Customer> list = customerDao.queryByNameAndTelephone2(c);
        for (Customer customer : list) {
            System.out.println(customer);
        }


        //4.关闭连接
        sqlSession.close();
    }

    /**
     * where标签的使用
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testQueryByNameAndTelephone3(){
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        //3.调用方法
        Customer c = new Customer();
        c.setName("%小%");

        List<Customer> list = customerDao.queryByNameAndTelephone3(c);
        for (Customer customer : list) {
            System.out.println(customer);
        }


        //4.关闭连接
        sqlSession.close();
    }

    /**
     * sql标签的使用
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testQueryByNameAndTelephone4(){
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        //3.调用方法
        Customer c = new Customer();
        c.setName("%小%");

        List<Customer> list = customerDao.queryByNameAndTelephone4(c);
        for (Customer customer : list) {
            System.out.println(customer);
        }


        //4.关闭连接
        sqlSession.close();
    }

    /**
     * foreach标签的使用
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testDeleteCustomerByIn(){
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.创建传统Dao实现类对象
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        //3.调用方法
        List<Integer> custIds = new ArrayList<>();
        custIds.add(6);
        custIds.add(7);

        customerDao.deleteCustomerByIn(custIds);

        //提交事务
        sqlSession.commit();

        //4.关闭连接
        sqlSession.close();
    }
}
