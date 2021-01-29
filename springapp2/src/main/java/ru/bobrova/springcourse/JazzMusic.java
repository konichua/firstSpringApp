package ru.bobrova.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class JazzMusic implements Music{
    private List<String> list = new ArrayList<>();
    {
        list.add("Armstrong");
        list.add("Davis");
        list.add("Sinatra");
    }

    @Override
    public String getSong(int nb) {
        return list.get(nb);
    }
}
