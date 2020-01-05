package com.yiidian.dao.impl;

import com.yiidian.dao.CustomerDao;
import com.yiidian.domain.Customer;
import com.yiidian.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Dao实现类
 */
public class CustomerDaoImpl implements CustomerDao{
    @Override
    public List<Customer> findAll() {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSession();
            return sqlSession.selectList("com.yiidian.dao.CustomerDao.findAll");
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            sqlSession.close();
        }
        return null;
    }

    @Override
    public void save(Customer customer) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSession();
            sqlSession.insert("com.yiidian.dao.CustomerDao.save", customer);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally{
            sqlSession.close();
        }
    }

    @Override
    public void update(Customer customer) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSession();
            sqlSession.update("com.yiidian.dao.CustomerDao.update", customer);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally{
            sqlSession.close();
        }
    }

    @Override
    public Customer findById(Integer id) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSession();
            return sqlSession.selectOne("com.yiidian.dao.CustomerDao.findById",id);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            sqlSession.close();
        }
        return null;
    }

    @Override
    public List<Customer> findByName(String name) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSession();
            return sqlSession.selectList("com.yiidian.dao.CustomerDao.findByName",name);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            sqlSession.close();
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        SqlSession sqlSession = null;
        try {
            sqlSession = MyBatisUtils.getSession();
            sqlSession.delete("com.yiidian.dao.CustomerDao.delete", id);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally{
            sqlSession.close();
        }
    }
}
