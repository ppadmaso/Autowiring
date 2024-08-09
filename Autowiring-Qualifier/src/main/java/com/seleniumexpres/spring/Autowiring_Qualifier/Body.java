package com.seleniumexpres.spring.Autowiring_Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Body 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
       Human human = ctx.getBean("human",Human.class);
       human.pump();
       
       
    }
}
