package Unit;

import java.util.ArrayList;

public abstract class Warrior extends Human {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed,
            int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }

    @Override
    public boolean step(ArrayList<Human> team1ArrayList, ArrayList<Human> team2ArrayList) {
        if (state.equals("Die"))
            return false;
        Human victim = team2ArrayList.get(findNearest(team2ArrayList));
        if (victim.coords.getDistance(coords) < 2) {
            float damage = (victim.defense - attack) > 0 ? damageMin
                    : (victim.defense - attack) < 0 ? damageMax : (damageMin + damageMax) / 2;
            victim.getDamage(damage);
        } else {
            Vector2D tempvc = coords.chooseWay(victim.coords);
            if (Math.abs(tempvc.posX) < Math.abs(tempvc.posY)) {
                if (coords.chooseWay(victim.coords).posY > 0) {
                    coords.posY--;
                } else {
                    coords.posY++;
                }
            } else {
                if (coords.chooseWay(victim.coords).posY > 0) {
                    coords.posX--;
                } else {
                    coords.posX++;
                }
            }
        }
        return true;
    }
}
