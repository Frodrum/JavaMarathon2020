package day12.task5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(includeFieldNames = false)
@AllArgsConstructor
public class MusicArtist {
    private String name;
    private int age;
}
