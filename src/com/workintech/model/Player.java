package com.workintech.model;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;

        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void  loseHealt(int damage){
        healthPercentage-=damage;
        if(healthPercentage<0){
            System.out.println(name+"player knock out");
            healthPercentage=0;
        }
    }
    public void restoreHealt(int healtPotion){
        healthPercentage+=healtPotion;
        if(healthPercentage>100){
            healthPercentage=100;
        }
    }



    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
