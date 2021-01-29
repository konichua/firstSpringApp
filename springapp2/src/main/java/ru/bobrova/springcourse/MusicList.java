package ru.bobrova.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicList {
    private List<Music> list = new ArrayList<>();

    public MusicList(Music music1,
                     Music music2,
                     Music music3) {
        list.add(music1);
        list.add(music2);
        list.add(music3);
    }

    public List<Music> getList() {
        return list;
    }
}
