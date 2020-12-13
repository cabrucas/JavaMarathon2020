package day11.task2;

public abstract class Hero implements PhysAttack {
    private double health;
    private double physDef;
    private double magicDef;
    private int physAtt;

    public int getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }

    public Hero() {
        this.health = 100;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
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
    public String toString() {
        return String.format("%s { health = %.2f }", getClass().getSimpleName(), getHealth());
    }
}
