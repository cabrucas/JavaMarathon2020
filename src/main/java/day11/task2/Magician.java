package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private int magicAtt;

    public Magician() {
        setPhysDef(0d);
        setMagicDef(0.8);
        setPhysAtt(5);
        setMagicAtt(20);
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
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
