package com.yiidian.dao;

import com.yiidian.domain.User;

import java.util.List;

/**
 * 用户Dao接口
 * 一点教程网 - www.yiidian.com
 */
public interface UserDao {
    /**
     * 查询所有用户
     */
    public List<User> findAllUsers();
}
