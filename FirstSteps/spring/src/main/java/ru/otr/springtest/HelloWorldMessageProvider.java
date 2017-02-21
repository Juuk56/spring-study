package ru.otr.springtest;

/**
 * Created by fedorov.vasiliy on 21.02.2017.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage(){
        return "Hello World!";
    }
}
