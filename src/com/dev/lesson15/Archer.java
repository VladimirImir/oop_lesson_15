package com.dev.lesson15;

public class Archer extends Hero {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + ": произвёл выстрел из лука!" + " - " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    /**
     * Вложенный класс - static.
     */
    /**
     * Внутренний класс - без static.
     */
    public class Wolf {

        private String name;
        private int damage;

        Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносят совместный урон!");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
