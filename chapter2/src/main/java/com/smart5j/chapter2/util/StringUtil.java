package com.smart5j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by wangrui on 16/6/30.
 * <p>
 * 字符串的工具类
 */
public final class StringUtil {
    // 判断字符串是否为空
    public static boolean isEmpty(String str) {
        if (str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    // 判断字符串是否非空
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
