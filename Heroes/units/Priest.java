package Heroes.units;

public abstract class Priest extends BaseHero {
    private int mana;

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Priest(String heroID, int health, int endurance, int speed, int mana) {
        super(heroID, health, endurance, speed);
        this.mana = mana;
    }
}
