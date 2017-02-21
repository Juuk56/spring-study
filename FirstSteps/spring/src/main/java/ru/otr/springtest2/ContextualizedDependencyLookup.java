package ru.otr.springtest2;

import com.sun.tracing.dtrace.DependencyClass;

/**
 * Created by fedorov.vasiliy on 21.02.2017.
 */
public class ContextualizedDependencyLookup implements ManagedComponent {
    private Dependency dependency;

    @Override
    public void performLookup(Container container){
        this.dependency = (Dependency)container.getDependency("myDependency");
    }

    @Override
    public String toString(){
        return dependency.toString();
    }
}
