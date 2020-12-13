package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private int magicAtt = 15;

    public Shaman() {
        super.setPhysAtt(10);
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
            hero.setHealth(hero.getHealth() - magicAtt);
        else
            hero.setHealth(hero.getHealth() - (magicAtt - magicAtt * hero.getMagicDef()));

        if (hero.getHealth() < 0)
            hero.setHealth(0);
    }

    @Override
    public String toString() {
        return String.format("Shaman{health = %s}", super.getHealth());
    }
}