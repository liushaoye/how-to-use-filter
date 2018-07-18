package com.springboot.filter.config;

import com.springboot.filter.myfilter2.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.RegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/******************************
 * @author : liuyang
 * <p>ProjectName:how-to-use-filter  </p>
 * @ClassName :  FilterConfig
 * @date : 2018/7/18 0018
 * @time : 22:25
 * @createTime 2018-07-18 22:25
 * @version : 2.0
 * @description :
 *
 *
 *
 *******************************/

@Configuration
public class FilterConfig {


    @Bean
    public FilterRegistrationBean heFilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(
                new MyFilter2()
        );

        filterRegistrationBean.addUrlPatterns("/*");

        return filterRegistrationBean;
    }

}
