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

    /**
     * 添加
     */
    public void save(Customer customer);

    /**
     * 修改
     */
    public void update(Customer customer);

    /**
     * 查询一个
     */
    public Customer findById(Integer id);

    /**
     * 条件查询
     */
    public List<Customer> findByName(String name);

    /**
     * 删除
     */
    public void delete(Integer id);
}
