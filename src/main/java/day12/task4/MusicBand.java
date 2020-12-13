package day12.task4;

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
    private List<String> groupMembers;

    public static void transferMembers(MusicBand firstGroup, MusicBand secondGroup) {
        secondGroup.getGroupMembers().addAll(firstGroup.getGroupMembers());
        firstGroup.getGroupMembers().clear();
    }

    public void printMembers(List<String> groupMembers) {
        groupMembers.forEach(System.out::println);
    }

    public List<String> getMembers() {
        return groupMembers;
    }
}
