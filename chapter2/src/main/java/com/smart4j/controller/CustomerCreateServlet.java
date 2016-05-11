package com.smart4j.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by miraclewong on 16/5/11.
 */

/**
 * 创建客户
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {

    /**
     * 进入 "创建客户" 页面
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 16/5/11  
    }

    /**
     * 处理 "创建客户" 请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 16/5/11  
    }
}
