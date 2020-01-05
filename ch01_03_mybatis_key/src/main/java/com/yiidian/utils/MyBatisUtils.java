package com.yiidian.utils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
/**
 * 工具类
 *一点教程网 - www.yiidian.com
 */
public class MyBatisUtils {
    private static SqlSessionFactoryBuilder builder;
    private static SqlSessionFactory factory;

    /**
     * 初始化SqlSessionFactory
     */
    static {
        try {
            builder = new SqlSessionFactoryBuilder();
            InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            factory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取sqlSession
     */
    public static SqlSession getSession(){
        return factory.openSession();
    }
}
