package com.sgl.mystarter.sglhello.config;
/**
 * Created by Ni Klaus on 2019/10/10 0010
 */

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *@ClassName HelloProperties
 *@Description TODO 读取配置文件里面 sglhello.hello 的内容 并绑定到 HelloProperties对象上
 *@Author Ni Klaus
 *@Date 2019/10/10 0010 下午 19:29
 *@Version 1.0
 */

@ConfigurationProperties(prefix = "sglhello.hello")
public class HelloProperties {
    private String start;
    private String end;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
