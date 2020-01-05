package com.yiidian.mybatis;

import com.yiidian.dao.OrderDao;
import com.yiidian.dao.UserDao;
import com.yiidian.domain.Order;
import com.yiidian.domain.User;
import com.yiidian.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * MyBatis测试类 - 一对多映射
 * 一点教程网 - www.yiidian.com
 */
public class TestOne2Many {

    /**
     * 测试一对多映射
     */
    @Test
    public void testOrderDao(){
        //1.获取SqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        //2.创建Mapper代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);

        //3.调用方法
        List<User> list = userDao.findAllUsers();
        System.out.println(list);

        //4.关闭连接
        sqlSession.close();
    }

}
