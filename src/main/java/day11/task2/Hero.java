package day11.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Hero {
    private double Health = 100;
    private int physAtt;
    private int magicAtt;
    private double physDef;
    private double magicDef;
}