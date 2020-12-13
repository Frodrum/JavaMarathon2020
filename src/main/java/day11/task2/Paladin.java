package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        super.setPhysAtt(15);
        super.setPhysDef(0.5);
        super.setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        super.setHealth(Math.min(super.getHealth() + 25, 100));
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.min(hero.getHealth() + 10, 100));
    }

    @Override
    public String toString() {
        return String.format("Paladin{health = %s}", super.getHealth());
    }
}