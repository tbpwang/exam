package edu.cumtb.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
public class BaseController {
    HttpServletRequest request;
    HttpServletResponse response;
    HttpSession session;
    ServletContext application;

    @ModelAttribute
    void set(HttpServletRequest request, HttpServletResponse response){
        this.request = request;
        this.response = response;
        session = request.getSession();
        application = request.getServletContext();
    }

}
