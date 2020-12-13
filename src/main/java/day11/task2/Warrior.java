package day11.task2;

public class Warrior extends Hero {

    public Warrior() {
        super.setPhysAtt(30);
        super.setPhysDef(0.8);
        super.setMagicDef(1.0);
    }

    @Override
    public String toString() {
        return String.format("Warrior{health = %s}", super.getHealth());
    }
}