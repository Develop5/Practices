package org.examples.encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;           // We selected to change the name of the parameter
                                            // only in the constructor. Does not affect the code
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health < 0 ) {
            this.healthPercentage = 1;
        } else if (health > 100 ) {
            this.healthPercentage = 100;
        } else this.healthPercentage = health;
        this.weapon = weapon;
    }

    private void looseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
