package com.dev.lesson18.weapon;

/** Bow - лук. */
public class Bow implements RangeWeapon{

    @Override
    public int getDamage() {
        return 10;
    }
}
