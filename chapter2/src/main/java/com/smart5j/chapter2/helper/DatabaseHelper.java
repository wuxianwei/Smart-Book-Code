package com.smart5j.chapter2.helper;


import com.smart5j.chapter2.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by wangrui on 16/7/1.
 *
 *
 * 操作数据库的助手类
 */
public final class DatabaseHelper {

    public static final Logger LOGGER = LoggerFactory.getLogger(DatabaseHelper.class);

    private static final String DRIVER;
    private static final String URL;
    private static final String USERNMAE;
    private static final String PASSWORD;


    static {
        Properties conf = PropsUtil.loadProps("config.properties");
        DRIVER = conf.getProperty("jdbc.driverClassName");
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
}
