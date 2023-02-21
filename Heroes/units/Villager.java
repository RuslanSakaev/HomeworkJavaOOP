package Heroes.units;

public class Villager extends BaseHero {
    private int seeds;

    public int getSeeds() {
        return seeds;
    }
    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }
    public Villager(String heroID) {
        super(heroID, 32, 43, 54);
        this.seeds = 23;
    }
    @Override
    public String getInfo() {
        return "Крестьянин " + heroID;
    }
}
