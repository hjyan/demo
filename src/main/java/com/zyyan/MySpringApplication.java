/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zyyan;

import com.zyyan.config.UserProps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author win 10
 */
//@Configuration : 表示Application作为sprig配置文件存在 
//@EnableAutoConfiguration: 启动spring boot内置的自动配置 
//@ComponentScan : 扫描bean，路径为Application类所在package以及package下的子路径，这里为 com.lkl.springboot，在spring boot中bean都放置在该路径已经子路径下。
@RestController
@SpringBootApplication
public class MySpringApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MySpringApplication.class);
		app.run(MySpringApplication.class, args);
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String sayWorld(@PathVariable("name") String name) {
		return "Hello " + name;
	}

}
