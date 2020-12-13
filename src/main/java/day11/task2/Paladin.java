package day11.task2;

public class Paladin extends Hero implements Healer {
    private final int TEAMMATE_HEALING_POOL = 10;
    private final int SELF_HEALING_POOL = 25;

    public Paladin() {
        setPhysDef(0.5);
        setMagicDef(0.2);
        setPhysAtt(15);
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
