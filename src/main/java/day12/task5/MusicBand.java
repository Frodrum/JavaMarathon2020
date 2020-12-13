package day12.task5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString(includeFieldNames = false)
@AllArgsConstructor
public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> groupMembers;

    public static void transferMembers(MusicBand firstGroup, MusicBand secondGroup) {
        secondGroup.getGroupMembers().addAll(firstGroup.getGroupMembers());
        firstGroup.getGroupMembers().clear();
    }

    public void printMembers(List<MusicArtist> groupMembers) {
        groupMembers.forEach(System.out::println);
    }

    public List<MusicArtist> getMembers() {
        return groupMembers;
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