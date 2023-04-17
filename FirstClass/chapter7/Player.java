package FirstClass.chapter7;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public Player() {

    }

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player died");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extrahealth) {
        health = health + extrahealth;
        if (health > 100) {
            System.out.println("Player Health is restored to 100%");
            health = 100;

        }
    }

}
