package com.yiidian.web;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import com.yiidian.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 控制器
 * 一点教程网 - www.yiidian.com
 */
public class CustomerServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.获取SqlSession对象
        SqlSession session = MyBatisUtils.getSession();
        //2.生成Dao代理对象
        CustomerDao customerDao = session.getMapper(CustomerDao.class);
        //3.调用方法
        List<Customer> list = customerDao.findAll();
        System.out.println(list);

        //4.关闭连接
        session.close();
    }
}
