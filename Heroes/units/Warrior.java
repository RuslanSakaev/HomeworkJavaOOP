package Heroes.units;

public abstract class Warrior extends BaseHero {
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Warrior(String heroID, int health, int endurance, int speed, int power) {
        super(heroID, health, endurance, speed);
        this.power = power;
    }
}
