
import Heroes.units.Arbalester;
import Heroes.units.Magician;
import Heroes.units.Monarch;
import Heroes.units.Raider;
import Heroes.units.Sniper;
import Heroes.units.Spearman;
import Heroes.units.Villager;

public class Main {
    public static void main(String[] args) {
        Sniper name1 = new Sniper("Я Иван");
        System.out.println(name1.getInfo());
        Arbalester name2 = new Arbalester("Я Дима");
        System.out.println(name2.getInfo());
        Spearman name3 = new Spearman("Я Вася");
        System.out.println(name3.getInfo());
        Raider name4 = new Raider("Я Петя");
        System.out.println(name4.getInfo());
        Magician name5 = new Magician("Я Лёша");
        System.out.println(name5.getInfo());
        Monarch name6 = new Monarch("Я Тема");
        System.out.println(name6.getInfo());
        Villager name7 = new Villager("Я Илья");
        System.out.println(name7.getInfo());

    }
}