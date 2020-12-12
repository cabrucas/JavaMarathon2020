package day11.task2;

public class Warrior extends Hero implements PhysAttack {
    private int physAtt;

    public Warrior() {
        setHealth(100d);
        setPhysDef(0.8);
        setMagicDef(0d);
        setPhysAtt(30);
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double life = hero.getHealth() - (this.getPhysAtt() * (1 - hero.getPhysDef()));
        if (life <= 0) {
            hero.setHealth(0);
        } else {
            hero.setHealth(life);
        }
    }
}
