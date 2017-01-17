package io.github.uestc_dpz.app.ioc.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.annotation.PostConstruct;

@ToString
public class Car implements BeanFactoryAware,
        BeanNameAware,
        InitializingBean,
        DisposableBean  {
    @Setter @Getter private String brand;
    @Setter @Getter private String color;
    @Setter @Getter private int    maxSpeed;

    private BeanFactory beanFactory;
    private String      beanName;

    public Car() {
        System.out.println("call constructor for car");
    }

    @PostConstruct
    private void postConstructor() {
        System.out.println("call post constructor annotation");
    }

    public void myInit() {
        System.out.println("call my init-method in configuration");
    }

    public void myDestroy() {
        System.out.println("call my destroy in configuration");
    }

    public void display() {
        System.out.println("Car : brand " + brand + " color " + color + "maxSpeed" + maxSpeed);
    }

    //~--------------------------------
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("call BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    //~---------------------------------
    public void setBeanName(String beanName) {
        System.out.println("call BeanNameAware.setBeanName()");
        this.beanName = beanName;
    }

    //~-------------------------------
    public void destroy() throws Exception {
        System.out.println("call DisposableBean.destroy()");
    }

    //~-------------------------------
    public void afterPropertiesSet() throws Exception {
        System.out.println("call InitializingBean.afterPropertiesSet()");
    }
}
