package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman() {
        super.setPhysAtt(10);
        super.setMagicAtt(15);
        super.setPhysDef(0.2);
        super.setMagicDef(0.2);
    }

    @Override
    public void healHimself() {
        super.setHealth(Math.min(super.getHealth() + 50, 100));
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(Math.min(hero.getHealth() + 30, 100));
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
        return String.format("Shaman{health = %s}", super.getHealth());
    }
}