package com.springboot.filter.myfilter2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/******************************
 * @author : liuyang
 * <p>ProjectName:how-to-use-filter  </p>
 * @ClassName :  MyFilter
 * @date : 2018/7/18 0018
 * @time : 21:53
 * @createTime 2018-07-18 21:53
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

public class MyFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("He**您已进入filter过滤器,您的请求正常,请继续遵循使用 ==========");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
