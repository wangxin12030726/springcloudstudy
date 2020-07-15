package com.wangxin.springcloud.controller;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.context.ShutdownEndpoint;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
//@Configuration
public class ActuatorSecurityConfig {
        //extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .requestMatchers(EndpointRequest.to(ShutdownEndpoint.class))
//                .hasRole("ACTUATOR_ADMIN")
//                .requestMatchers(EndpointRequest.toAnyEndpoint())
//                .permitAll()
//                .requestMatchers(PathRequest.toStaticResources().atCommonLocations())
//                .permitAll()
//                .antMatchers("/")
//                .permitAll()
//                .antMatchers("/**")
//                .authenticated()
//                .and()
//                .httpBasic();
//    }
}
