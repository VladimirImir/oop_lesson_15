package com.dev.lesson15;

public class TrainingGround {

    public static void main(String[] args) {

        Hero warrior = new Warrior("Терминатор", 15);
        // warrior.attackEnemy();

        Hero mage = new Mage("Гэндальф", 20);
        // mage.attackEnemy();

        Archer archer = new Archer("Леголас", 10);
        // archer.attackEnemy();

        Archer.Wolf wolf = archer.new Wolf("Second wolf", 11);

        Enemy enemy = new Enemy("Зомби", 100);

        attackEnemy(enemy, warrior, mage, archer);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }

        /*for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }*/
    }
}
