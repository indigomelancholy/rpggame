class Character {
    public String name;
    public int health;
    public int mana;
    public int level;

    public Character(String name, int health, int mana, int level) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.level = level;
    }

    public Character() {}

    public void levelUp() {
        System.out.println(name + " levels up!");
        this.level += 1;
        this.mana += 5;
        this.health += 15;
    }

    public void statsDisp() {
        System.out.println(name + "'s status:");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Level: " + level);
    }
}