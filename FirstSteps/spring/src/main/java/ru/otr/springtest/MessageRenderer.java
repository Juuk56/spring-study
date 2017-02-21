package ru.otr.springtest;

/**
 * Created by fedorov.vasiliy on 21.02.2017.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider (MessageProvider provider);
    MessageProvider getMessageProvider();
}
