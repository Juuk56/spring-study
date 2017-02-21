package ru.otr.springtest2;

/**
 * Created by fedorov.vasiliy on 21.02.2017.
 */
public class ConstructorInjection {
    private Dependency dependency;

    public ConstructorInjection(Dependency dependency){
        this.dependency = dependency;
    }

    @Override
    public String toString(){
        return dependency.toString();
    }
}
