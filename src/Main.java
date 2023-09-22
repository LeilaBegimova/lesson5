import java.util.StringJoiner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       Hero hero = new Hero("levi","100","50","MAGIC");
        System.out.println(hero.getName());
        System.out.println(hero.getHealth());
        System.out.println(hero.getDomage());
        System.out.println(hero.getSuperpower());
        Hero hero1 = new Hero("100","50");
        System.out.println(hero1.getHealth());
        System.out.println(hero1.getDomage());
        





        Boss boss= new Boss("BOSS","Здоровье 150","Урон 60","Тип защиты ARMOR");

        System.out.println(boss.getName());
        System.out.println(boss.getHealth());
        System.out.println(boss.getDomade());
        System.out.println(boss.getProtection());







        }
    }




