package com.yiidian.mybatis;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import com.yiidian.domain.CustomerExample;
import com.yiidian.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * 测试逆向工程生成的Dao
 * 一点教程网 - www.yiidian.com
 */
public class CustomerDaoTest {

    /**
     * 测试insert方法
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testInsert(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        Customer cust = new Customer();
        cust.setName("小明");

        customerDao.insert(cust);

        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试insertSelective方法
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testInsertSelective(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        Customer cust = new Customer();
        cust.setName("小明");

        customerDao.insertSelective(cust);

        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试UpdateByPrimaryKey方法
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testUpdateByPrimaryKey(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        Customer cust = new Customer();
        cust.setId(3);
        cust.setName("小明");

        customerDao.updateByPrimaryKey(cust);

        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试updateByPrimaryKeySelective方法
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testUpdateByPrimaryKeySelective(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        Customer cust = new Customer();
        cust.setId(3);
        cust.setName("小明");

        customerDao.updateByPrimaryKeySelective(cust);

        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 测试SelectByExample方法
     * 一点教程网 - www.yiidian.com
     */
    @Test
    public void testSelectByExample(){
        SqlSession sqlSession = MyBatisUtils.getSession();
        CustomerDao customerDao = sqlSession.getMapper(CustomerDao.class);

        //1.创建Example对象，Example是MyBatis逆向工程生成的封装了所有查询条件的对象
        CustomerExample customerExample = new CustomerExample();
        //2.添加查询条件
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        //需求：根据name模糊查询
        //criteria.andNameLike("%小%");
        //需求：根据gender查询
        criteria.andGenderEqualTo("女");


        List<Customer> list = customerDao.selectByExample(customerExample);
        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void testDeleteByPrimaryKey(){

    }
}
