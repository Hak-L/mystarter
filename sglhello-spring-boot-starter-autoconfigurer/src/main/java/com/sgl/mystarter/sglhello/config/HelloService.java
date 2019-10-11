package com.sgl.mystarter.sglhello.config;
/**
 * Created by Ni Klaus on 2019/10/10 0010
 */

/**
 *@ClassName HelloService
 *@Description TODO 简单业务逻辑实现
 *@Author Ni Klaus
 *@Date 2019/10/10 0010 下午 19:47
 *@Version 1.0
 */
public class HelloService {
    //读取配置类里面的配置信息
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }
    //赋值配置对象
    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
    //简单业务逻辑
    public String sayHellSgl(String name){
        return helloProperties.getStart()+"-" +name + helloProperties.getEnd();
    }
}
