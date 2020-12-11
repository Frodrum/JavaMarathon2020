package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        super.setPhysAtt(5);
        super.setMagicAtt(20);
        super.setPhysDef(1);
        super.setMagicDef(0.8);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getMagicDef() == 1)
            hero.setHealth(hero.getHealth() - super.getMagicAtt());
        else
            hero.setHealth(hero.getHealth() - (super.getMagicAtt() - super.getMagicAtt() * hero.getMagicDef()));

        if (hero.getHealth() < 0)
            hero.setHealth(0);
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
        return String.format("Magician{health = %s}", super.getHealth());
    }
}