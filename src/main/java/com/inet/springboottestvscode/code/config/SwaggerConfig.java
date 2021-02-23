package com.inet.springboottestvscode.code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger的自定义配置文件
 *
 * @author HCY
 * @since 2020/12/20 上午 11:02
*/

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置API文本的标题
                .title("晓寻遥 API")
                //API文档的说明
                .description("更多请资讯晓寻遥")
                .contact(new Contact(
                        "晓寻遥"
                        ,"xiaoxunyao.xyz"
                        ,"huchengyea@163.com"))
                .version("1.1.0")
                .build();
    }
}
