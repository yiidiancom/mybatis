package com.yiidian.dao;

import com.yiidian.domain.Customer;
import com.yiidian.domain.CustomerExample;
import java.util.List;

/**
 * 一点教程网 - www.yiidian.com
 */
public interface CustomerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}