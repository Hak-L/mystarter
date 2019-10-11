package com.sgl.mystarter.sglhello.config;
/**
 * Created by Ni Klaus on 2019/10/10 0010
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@ClassName HelloServiceAutoConfiguration
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/10/10 0010 下午 19:48
 *@Version 1.0
 */
@Configuration//申明这是一个配置类
@ConditionalOnWebApplication//引用启动器的项目是web应用此自动配置模块才生效
@EnableConfigurationProperties(HelloProperties.class)//加载配置对象到容器
public class HelloServiceAutoConfiguration {
    //注入配置对象
    @Autowired
    HelloProperties helloProperties;

    @Bean//方法返回结果对象加载到容器
    public HelloService helloService(){
        //新建业务逻辑处理对象，并返回加载到容器中，
        // 这样引用启动器的项目就可以 @Autowired  HelloService 对象直接使用了
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(helloProperties);
        return helloService;
    }
}
