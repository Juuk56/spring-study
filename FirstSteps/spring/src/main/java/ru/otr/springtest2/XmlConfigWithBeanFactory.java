package ru.otr.springtest2;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by fedorov.vasiliy on 21.02.2017.
 */
public class XmlConfigWithBeanFactory {
    public static void main(String[] args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new ClassPathResource("META-INF/spring/xml-bean-factory-config.xml"));
        Oracle oracle = (Oracle)factory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
