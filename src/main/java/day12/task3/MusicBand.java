package day12.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(includeFieldNames = false)
@AllArgsConstructor
public class MusicBand {
    private String name;
    private int year;
}
