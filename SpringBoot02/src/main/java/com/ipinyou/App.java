package com.ipinyou;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication
public class App extends WebMvcConfigurerAdapter {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        //定义一个消息转换对象
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        //增加fastjson的配置信息
        FastJsonConfig config = new FastJsonConfig();
        //设置转换特性
        config.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        转换器增加配置信息
        converter.setFastJsonConfig(config);
//将自定义转换器添加到转换器中
        converters.add(converter);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
