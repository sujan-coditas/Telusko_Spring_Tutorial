package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext ac= new ClassPathXmlApplicationContext("Spring.xml");


        Car c= (Car) ac.getBean("car");
        c.drive();


//        Vehicle obj= (Vehicle) ac.getBean("bike");
//        Vehicle obj1= (Vehicle) ac.getBean("car");
//        obj1.drive();
//        obj.drive();


//        Tyre tyre= (Tyre) ac.getBean("tyre");
//        System.out.println(tyre);




}
}
