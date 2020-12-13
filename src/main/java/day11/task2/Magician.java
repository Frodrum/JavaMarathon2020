package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt = 20;

    public Magician() {
        super.setPhysAtt(5);
        super.setPhysDef(1);
        super.setMagicDef(0.8);
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getMagicDef() == 1)
            hero.setHealth(hero.getHealth() - magicAtt);
        else
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));

        if (hero.getHealth() < 0)
            hero.setHealth(0);
    }

    @Override
    public String toString() {
        return String.format("Magician{health = %s}", super.getHealth());
    }
}