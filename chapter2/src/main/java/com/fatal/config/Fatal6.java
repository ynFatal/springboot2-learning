package com.fatal.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * 配置类
 * @author: Fatal
 * @date: 2018/9/20 0020 16:16
 */
@Component
@ConfigurationProperties(prefix = "fatal6")
@ToString
@Data
public class Fatal6 {

    private String name;

    private Integer age;

}