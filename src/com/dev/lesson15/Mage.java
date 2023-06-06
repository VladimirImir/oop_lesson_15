package com.dev.lesson15;

import com.dev.lesson18.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + ": прочитал заклинание!" + " - " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
