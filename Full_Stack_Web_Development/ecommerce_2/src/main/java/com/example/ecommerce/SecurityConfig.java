package com.example.ecommerce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.SecurityFilterChain;

//TODO 28: In src/main/java/com/example/ecommerce, create a new class called SecurityConfig.
//TODO 29: Annotate SecurityConfig with @Configuration.
@Configuration
public class SecurityConfig {

    private final UserService userService;
    public SecurityConfig(UserService userService) {
        this.userService = userService;
    }

    //TODO 30: In SecurityConfig, configure a SecurityFilterChain bean with:
    //    /products/** and /actuators/** secured for ADMIN role
    //    Enable basic authentication
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .requestMatchers("/actuator/**", "/products/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();

                http.headers().frameOptions().disable();
        return http.build();
    }

    //TODO 31: Implement a UserDetailsService bean in SecurityConfig to load user details by username from UserService.
    @Bean
    public UserDetailsService userDetailsService() {
        return username ->{
            Users user =userService.findByUsername(username);
            if (user==null){
                throw new UsernameNotFoundException("User not found");
            }
            UserDetails userDetails =org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
                    .password(user.getPassword())
                    .roles(user.getRole())
                    .build();
            return userDetails;
        };
    }
}
