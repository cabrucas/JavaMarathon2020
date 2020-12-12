package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack, PhysAttack {
    private int magicAtt;
    private int physAtt;
    private final int TEAMMATE_HEALING_POOL = 30;
    private final int SELF_HEALING_POOL = 50;

    public Shaman() {
        setHealth(100d);
        setPhysDef(0.2);
        setMagicDef(0.2);
        setPhysAtt(10);
        setMagicAtt(15);
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
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
    public void magicalAttack(Hero hero) {
        double life = hero.getHealth() - (this.getMagicAtt() * (1 - hero.getMagicDef()));
        if (life <= 0) {
            hero.setHealth(0);
        } else {
            hero.setHealth(life);
        }
    }
}
