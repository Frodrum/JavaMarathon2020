package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> firstGroupMembers = new ArrayList<>(Arrays.asList(
                new MusicArtist("Ангус Янг", 1955),
                new MusicArtist("Малькольм Янг", 1953),
                new MusicArtist("Филл Рад", 1954),
                new MusicArtist("Клифф Уильямс", 1949)));

        List<MusicArtist> secondGroupMembers = new ArrayList<>(Arrays.asList(
                new MusicArtist("Чед Крюгер", 1974),
                new MusicArtist("Райан Пик", 1973),
                new MusicArtist("Майкл Крюгер", 1972)));

        MusicBand firstGroup = new MusicBand("AC/DC", 1973, firstGroupMembers);
        MusicBand secondGroup = new MusicBand("Nickelback", 1995, secondGroupMembers);

        MusicBand.transferMembers(firstGroup, secondGroup);
        firstGroup.printMembers(firstGroup.getGroupMembers());
        System.out.println("= = = =");
        secondGroup.printMembers(secondGroup.getGroupMembers());
    }
}

/**
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника музыкальной группы есть не только имя,
 * но и возраст. Соответственно, теперь под участником понимается не строка, а объект класса MusicArtist.
 * Необходимо реализовать класс MusicArtist и доработать класс MusicBand (создать копию класса) таким образом,
 * чтобы участники были - объекты класса MusicArtist. После этого, надо сделать то же самое, что и требовалось
 * в 4 задании - слить две группы и проверить состав групп после слияния. Методы для слияния и для вывода
 * участников в консоль необходимо тоже переработать, чтобы они работали с объектами класса MusicArtist.
 */