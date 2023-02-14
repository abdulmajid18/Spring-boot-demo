package com.rozz.DefiningBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

public class SampleBean {
    public void init() {
    }

    public void destroy() {
    }
    // Bean code
}

interface BeanInterface {
}

class BeanInterfaceImpl implements BeanInterface {
}

@Configuration
class AppConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy", name = { "sampleBean", "sb" })
    @Description("Demonstrate a simple bean")

    public SampleBean sampleBean() {
        return new SampleBean();
    }

    @Bean
    public BeanInterface beanInterface() {
        return new BeanInterfaceImpl();
    }
}