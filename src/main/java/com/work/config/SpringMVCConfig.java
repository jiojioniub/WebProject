package com.work.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.work.controller","com.work.config","com.work.controller.Exception"})
@EnableWebMvc
public class SpringMVCConfig {

}
