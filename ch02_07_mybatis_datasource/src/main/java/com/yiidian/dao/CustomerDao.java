package com.yiidian.dao;
import com.yiidian.domain.Customer;
import java.util.List;
/**
 * Dao接口
 *一点教程网 - www.yiidian.com
 */
public interface CustomerDao {

    /**
     * 查询所有用户
     */
    public List<Customer> findAll();
}
