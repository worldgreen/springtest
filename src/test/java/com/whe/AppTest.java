package com.whe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.whe.pojo.Student;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.applet.AppletContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void studentTest() {
       // BeanFactory bf = new XmlBeanFactory(new ClassPathResource("test.xml"));
        ApplicationContext bf = new ClassPathXmlApplicationContext("test.xml");
        Student student = (Student)bf.getBean("student");
        assertEquals("whe", student.getName());
    }


}
