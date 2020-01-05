package com.yiidian.mybatis;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import com.yiidian.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * MyBatis测试类
 * 一点教程网 - www.yiidian.com
 */
public class TestCustomerDao2 {

    public static void main(String[] args) throws Exception {
        //1.创建SqlSession
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.生成Dao接口代理对象
        CustomerDao userDao = sqlSession.getMapper(CustomerDao.class);

        //3.执行Dao接口方法
        List<Customer> list = userDao.findAll();
        for(Customer c:list){
            System.out.println(c);
        }

        //4.释放资源
        sqlSession.close();
    }
}
