package com.proj.youtuberandomplaylist.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfigure implements WebMvcConfigurer {
    // html 파일들의 기본 경로를 static이 아닌 templates로 바꿔주기 위한 작업
    // 뒤에 .html을 제거하고 불러올 수 있도록 세팅해주기위해 application.properties에도 작업을 했음.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 1. /로 시작하는 모든 요청 핸들링
        // 2. html 탐색 경로를 /templates/로 지정
        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/templates/");
    }
}
