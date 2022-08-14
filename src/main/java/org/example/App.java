package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        // applicationContext.xml 无论有没有内容都需要加载
        ApplicationContext acx = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ApplicationContext quartz = new ClassPathXmlApplicationContext("/META-INF/config/quartz.xml");

    }
}
