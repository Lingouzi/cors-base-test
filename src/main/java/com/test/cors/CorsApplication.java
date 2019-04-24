package com.test.cors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 本服务端口8081, 再额外新建一个前端服务,使用8080端口访问本服务,请求数据.查看不同跨域模式下的差异.
 */
@SpringBootApplication
public class CorsApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(CorsApplication.class, args);
    }

    /**
     * 配置全局跨域允许
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*");
                // .allowedMethods(ALL)
                // .allowedHeaders(ALL)
                // .allowCredentials(true);
    }
}
