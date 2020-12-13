package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> listOfMusicBand = Arrays.asList(
                new MusicBand("AC/DC", 1973),
                new MusicBand("Nickelback", 1995),
                new MusicBand("AnnenMayKantereit", 2011),
                new MusicBand("Thirty Seconds to Mars", 1998),
                new MusicBand("The Glitch mob", 2006),
                new MusicBand("M83", 2011),
                new MusicBand("ГРОТ", 2009),
                new MusicBand("The Beatles", 1960),
                new MusicBand("Queen", 1970),
                new MusicBand("Imagine Dragons", 2008)
        );

        Collections.shuffle(listOfMusicBand);
        listOfMusicBand.forEach(System.out::println);
        System.out.println();

        groupsAfter2000(listOfMusicBand).forEach(System.out::println);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> listOfMusicBandAfter2000 = new ArrayList<>();

        bands.forEach(el -> {
            if (el.getYear() >= 2000)
                listOfMusicBandAfter2000.add(el);
        });

        return listOfMusicBandAfter2000;
    }
}