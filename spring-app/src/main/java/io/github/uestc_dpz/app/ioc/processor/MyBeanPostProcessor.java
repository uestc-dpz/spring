package io.github.uestc_dpz.app.ioc.processor;

import io.github.uestc_dpz.app.ioc.bean.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(s.equals("car")) {
            Car car = (Car)o;
            if(car.getColor() == null) {
                System.out.println("call BeanPostProcessor.postProcessBeforeInitialization");
                car.setColor("black");
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        if(s.equals("car")) {
            Car car = (Car)o;
            if(car.getMaxSpeed() >= 240) {
                System.out.println("call BeanPostProcessor.postProcessAfterInitialization");
                car.setMaxSpeed(200);
            }
        }
        return o;
    }
}
