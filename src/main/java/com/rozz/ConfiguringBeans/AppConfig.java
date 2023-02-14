package com.rozz.ConfiguringBeans;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class AppConfig {

    // no scope is defined so default singleton scope is
    // applied.
    // If you want to define it explicitly, you can do that
    // using
    // @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    // OR
    // @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    // Here, ConfigurableBeanFactory.SCOPE_SINGLETON is string
    // constant, which
    // value is "singleton". You can use the string also,
    // better to avoid it.
    @Bean
    public SingletonBean SingletonBean() {
        return new SingletonBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
    // You need a proxyMode attribute because when web-aware
    // context is
    // instantiated, you don't have any HTTP request.
    // Therefore,
    // Spring injects the proxy as a dependency and
    // instantiate the bean when HTTP request is invoked.
    // OR, in short you can write below which is a shortcut for
    // above
    @RequestScope
    public ReqScopedBean requestScopedBean() {
        return new ReqScopedBean();
    }
}
