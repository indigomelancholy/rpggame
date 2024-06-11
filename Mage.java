class Mage extends Character {
    private int intelligence;
    private int spellPower;

    public Mage(String name, int health, int mana, int level, int intelligence, int spellPower) {
        super(name, health, mana, level);
        this.intelligence = intelligence;
        this.spellPower = spellPower;
    }

    public void fireAttack(Character a) {
        System.out.println(name + " casted a fire spell on " + a.name + "!");
        this.mana -= 10;
        a.health -= 7;
    }

    public void nauseaDefence(Character a) {
        System.out.println(name + " casted a slow-down nausea spell on " + a.name + "!");
        this.mana -= 5;
        this.health += 4;
        a.mana -= 8;
    }

    public void statsDisp() {
        super.statsDisp();
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Spell Power: " + spellPower);
    }
}