package ru.bobrova.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

//    @Autowired
    public MusicPlayer(List<Music> list) {
        musicList = list;
    }

    public String playMusic() {
        Random random = new Random();
        int nbr = random.nextInt(3);

        return (musicList.get(nbr).getSong(random.nextInt(3)));
    }
}
