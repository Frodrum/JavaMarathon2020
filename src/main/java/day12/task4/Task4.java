package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> firstGroupMembers = new ArrayList<>(Arrays.asList("Ангус Янг", "Малькольм Янг", "Филл Рад", "Клифф Уильямс"));
        List<String> secondGroupMembers = new ArrayList<>(Arrays.asList("Чед Крюгер", "Райан Пик", "Майкл Крюгер"));

        MusicBand firstGroup = new MusicBand("AC/DC", 1973, firstGroupMembers);
        MusicBand secondGroup = new MusicBand("Nickelback", 1995, secondGroupMembers);

        MusicBand.transferMembers(firstGroup, secondGroup);
        firstGroup.printMembers(firstGroup.getGroupMembers());
        System.out.println("= = = =");
        secondGroup.printMembers(secondGroup.getGroupMembers());
    }
}