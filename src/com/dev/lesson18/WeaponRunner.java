package com.dev.lesson18;

import com.dev.lesson15.Archer;
import com.dev.lesson15.Warrior;
import com.dev.lesson18.weapon.Bow;
import com.dev.lesson18.weapon.Sword;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Терминатор", 10);
        warrior.setWeapon(new Sword());
    }
}
