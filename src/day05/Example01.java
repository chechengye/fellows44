package day05;

/**
 * 两个对象之间的一对一关系：
 */
public class Example01 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("张飞");
        hero.setWeapon(new Weapon("丈八蛇矛"));
        System.out.println(hero);
    }
}
class Hero{
    private String name;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                '}';
    }
}
class Weapon{
    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                '}';
    }
}