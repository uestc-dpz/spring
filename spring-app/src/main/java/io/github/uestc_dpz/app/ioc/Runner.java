package io.github.uestc_dpz.app.ioc;


import io.github.uestc_dpz.app.ioc.bean.Car;
import io.github.uestc_dpz.app.ioc.processor.MyBeanPostProcessor;
import io.github.uestc_dpz.app.ioc.processor.MyInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.net.URL;

public class Runner {
    public static void startSpring() {
//        Resource res = new ClassPathResource("classpath*:/spring/beans.xml");
//        try {
//            URL uri = res.getURL();
//            System.out.println(uri.getPath());
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        BeanFactory bf = new XmlBeanFactory(res);
//
//        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyBeanPostProcessor());
//
//        ((ConfigurableBeanFactory)bf).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
//
//        Car car1 = (Car)bf.getBean("car");
//        car1.display();
//
//        ((XmlBeanFactory)bf).destroySingletons();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath*:/spring/beans.xml"});
        context.start();
    }

    public static void main(String[] args) {
        startSpring();
    }
}
