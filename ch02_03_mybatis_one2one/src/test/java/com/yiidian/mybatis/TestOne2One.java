package com.yiidian.mybatis;

import com.yiidian.dao.OrderDao;
import com.yiidian.domain.Order;
import com.yiidian.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * MyBatis测试类 - 一对一映射
 * 一点教程网 - www.yiidian.com
 */
public class TestOne2One {

    /**
     * 测试一对一映射
     */
    @Test
    public void testOrderDao(){
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.创建Mapper代理对象
        OrderDao orderDao = sqlSession.getMapper(OrderDao.class);

        //3.调用方法
        List<Order> list = orderDao.findAllOrders();
        System.out.println(list);
        //4.关闭连接
        sqlSession.close();
    }

}
