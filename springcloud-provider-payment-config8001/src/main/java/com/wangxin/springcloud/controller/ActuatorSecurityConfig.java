package com.wangxin.springcloud.controller;

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
