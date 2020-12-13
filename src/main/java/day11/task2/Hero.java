package day11.task2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Hero implements PhysAttack {
    private double Health = 100;
    private int physAtt;
    private double physDef;
    private double magicDef;

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getPhysDef() == 1)
            hero.setHealth(hero.getHealth() - physAtt);
        else
            hero.setHealth(hero.getHealth() - (physAtt - physAtt * hero.getPhysDef()));

        if (hero.getHealth() < 0)
            hero.setHealth(0);
    }
}