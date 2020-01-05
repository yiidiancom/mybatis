package com.yiidian.dao;
import com.yiidian.domain.Customer;
import java.util.List;
/**
 * Dao接口
 *一点教程网 - www.yiidian.com
 */
public interface CustomerDao {

    /**
     * if标签的使用
     */
    public List<Customer> queryByNameAndTelephone(Customer customer);

    /**
     * choose标签的使用
     */
    public List<Customer> queryByNameAndTelephone2(Customer customer);

    /**
     * where标签的使用
     */
    public List<Customer> queryByNameAndTelephone3(Customer customer);

    /**
     * sql标签的使用
     */
    public List<Customer> queryByNameAndTelephone4(Customer customer);

    /**
     * foreach标签的使用
     */
    public void deleteCustomerByIn(List<Integer> custIds);


}
