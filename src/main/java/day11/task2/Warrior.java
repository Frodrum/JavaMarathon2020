package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super.setPhysAtt(30);
        super.setPhysDef(0.8);
        super.setMagicDef(1.0);
    }

    @Override
    public void physicalAttack(Hero hero) {
        if (hero.getPhysDef() == 1)
            hero.setHealth(hero.getHealth() - super.getPhysAtt());
        else
            hero.setHealth(hero.getHealth() - (super.getPhysAtt() - super.getPhysAtt() * hero.getPhysDef()));

        if (hero.getHealth() < 0)
            hero.setHealth(0);
    }

    @Override
    public String toString() {
        return String.format("Warrior{health = %s}", super.getHealth());
    }
}