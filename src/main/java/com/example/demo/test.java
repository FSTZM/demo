package com.example.demo;

import com.example.demo.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = ac.getBean(Teacher.class);
        //我想获取当前bean在容器中的名字怎么办?
        //aware接口存在的意义是:方便通过spring中的bean对象来获取对应容器中的相关属性值
        String beanName = teacher.getBeanName();
        Environment environment = teacher.getEnvironment();
    }

}
