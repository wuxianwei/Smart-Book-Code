package com.smart5j.chapter2.helper;


import com.smart5j.chapter2.util.PropsUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

/**
 * Created by wangrui on 16/7/1.
 *
 *
 * 操作数据库的助手类
 */
public final class DatabaseHelper {

    public static final Logger LOGGER = LoggerFactory.getLogger(DatabaseHelper.class);

    public static final QueryRunner QUERY_RUNNER = new QueryRunner();

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNMAE;
    private static final String PASSWORD;


    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driver");
        URL = conf.getProperty("jdbc.url");
        USERNMAE = conf.getProperty("jdbc.username");
        PASSWORD = conf.getProperty("jdbc.password");

        try{
            Class.forName(DRIVER);
        }
        catch (ClassNotFoundException e) {
            LOGGER.error("can not load the jdbc driver", e);
        }
    }


    /**
     * 获取数据库的连接
     */

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNMAE,PASSWORD);
        } catch (SQLException e){
            LOGGER.error("get connection failure", e);
        }
        return connection;
    }

    /**
     * 关闭数据库的连接
     */

    public static void closeConnection(Connection connection){
        if (connection != null) {
            try{
                connection.close();
            } catch (SQLException e){
                LOGGER.error("close the connection failure", e);
            }
        }
    }


    /**
     * 查询实体列表
     *
     * 使用DbUtils提供的QueryRunner对象可以面向实体(Entity)进行查询。
     * 实际上,首先执行SQL语句并返回一个ResultSet,随后通过反射去创建并初始化实体对象
     */
    public static <T> List<T> queryEntityList(Class<T> entityClass, String sql, Object... params) {
        List<T> entityList;
        try {
            Connection conn = getConnection();
            entityList = QUERY_RUNNER.query(conn, sql, new BeanListHandler<T>(entityClass), params);
        } catch (SQLException e) {
            LOGGER.error("query entity list failure", e);
            throw new RuntimeException(e);
        }
        return entityList;
    }
}
