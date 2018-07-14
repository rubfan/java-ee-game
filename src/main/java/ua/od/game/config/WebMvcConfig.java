package ua.od.game.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author ruslan.gramatic on 6/27/18.
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/images/**",
                "/css/**",
                "/font/**",
                "/music/**",
                "/sounds/**",
                "/javascript/**")
                .addResourceLocations(
                        "classpath:/static/images/",
                        "classpath:/static/css/",
                        "classpath:/static/font/",
                        "classpath:/static/music/",
                        "classpath:/static/sounds/",
                        "classpath:/static/javascript/");
    }
}
