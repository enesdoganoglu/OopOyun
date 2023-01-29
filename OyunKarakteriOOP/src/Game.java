public class Game {
    public static void main(String[] args) {
        Character warrior = new Warrior(100, 20, "Furkan", 50, "Blade");
        Character mage = new Mage(70, 30, "Beyza", 100, "Fireball");

        warrior.attack();
        mage.attack();
    }
}