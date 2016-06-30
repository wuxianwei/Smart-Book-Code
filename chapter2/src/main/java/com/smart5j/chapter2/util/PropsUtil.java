package com.smart5j.chapter2.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by wangrui on 16/6/30.
 *
 * 属性文件的工具类
 */
public class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);


    /**
     * 加载属性文件
     */

    public static Properties loadProps(String feleName){
        Properties props = null;

        InputStream inputStream = null;

        try{
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("../resources/config.properties");
        } finally {

        }
        return  props;
    }
}
