package io.github.uestc_dpz.app.ioc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;


public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {
    @Override
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName)
            throws BeansException{
        if("car".equals(beanName)) {
            System.out.println("Initialization AwareBeanPostProcessor, postProcess before initialization");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName)
            throws BeansException{
        if("car".equals(beanName)) {
            System.out.println("Initialization AwareBeanPostProcessor, postProcess after initialization");
        }

        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException{
        if("car".equals(beanName)) {
            System.out.println("Initialization AwareBeanPostProcessor, postProcess after initialization");
        }
        return pvs;
    }
}
