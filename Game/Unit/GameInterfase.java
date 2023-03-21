package Unit;

import java.util.ArrayList;

public interface GameInterfase {
    StringBuilder getInfo();
    boolean step(ArrayList<Human> team1, ArrayList<Human> team2);
}
