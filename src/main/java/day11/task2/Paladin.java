package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {
    private int physAtt;
    private final int TEAMMATE_HEALING_POOL = 10;
    private final int SELF_HEALING_POOL = 25;

    public Paladin() {
        setHealth(100d);
        setPhysDef(0.5);
        setMagicDef(0.2);
        setPhysAtt(15);
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

    @Override
    public void healHimself() {
        double healingPool = getHealth() + SELF_HEALING_POOL;
        if (healingPool >= 100) {
            setHealth(100);
        } else {
            setHealth(healingPool);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        double healingPool = hero.getHealth() + this.TEAMMATE_HEALING_POOL;
        if (healingPool >= 100) {
            hero.setHealth(100);
        } else {
            hero.setHealth(healingPool);
        }
    }
}
