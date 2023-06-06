package com.dev.lesson15;

import com.dev.lesson18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + ": ударил топором!" + " - " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
