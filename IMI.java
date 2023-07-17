public class IMI {
    public static void main(String[] args) {
        Player player = new Player("Alex");
        player.Attack();
        player.CastSpell("Fire Ball");
        player.Defend();
        player.UseWeapon();
    }
}

interface Character {
    void Attack();
    void Defend();
}

interface Mage {
    void CastSpell(String spell);
}

interface Warrior {
    void UseWeapon();
}

class Player implements Character, Mage, Warrior {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void UseWeapon() {
        System.out.println("Player use the weapon to attack.");
    }
    
    @Override
    public void CastSpell(String spell) {
        System.out.println("Player cast the " + spell + ".");
    }
    
    @Override
    public void Attack() {
        System.out.println("Player Attack the enemy.");
    }
    
    @Override
    public void Defend() {
        System.out.println("The player defend against attack the enemy.");

    }
    
} 