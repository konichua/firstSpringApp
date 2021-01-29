package ru.bobrova.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music {
    private List<String> list = new ArrayList<>();
    {
        list.add("Bah");
        list.add("Motsart");
        list.add("Bethoven");
    }

    @Override
    public String getSong(int nb) {
        return list.get(nb);
    }
}
