package day11.task2;

public abstract class Hero {
    private double health;
    private double physDef;
    private double magicDef;

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
    public String toString() {
        return String.format("%s { health = %.2f }", getClass().getSimpleName(), getHealth());
    }
}
