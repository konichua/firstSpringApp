package ru.bobrova.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class RockMusic implements Music{
    private List<String> list = new ArrayList<>();
    {
        list.add("Cobain");
        list.add("Mercury");
        list.add("Manson");
    }

    @Override
    public String getSong(int nb) {
        return list.get(nb);
    }
}
