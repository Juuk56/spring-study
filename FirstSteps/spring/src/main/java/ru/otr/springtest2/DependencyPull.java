package ru.otr.springtest2;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.otr.springtest.MessageRenderer;

/**
 * Created by fedorov.vasiliy on 21.02.2017.
 */
public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer",MessageRenderer.class);
        mr.render();
    }
}
