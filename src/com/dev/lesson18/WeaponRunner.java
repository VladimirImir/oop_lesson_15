package com.dev.lesson18;

import com.dev.lesson15.Archer;
import com.dev.lesson15.Hero;
import com.dev.lesson15.Warrior;
import com.dev.lesson18.weapon.Bow;
import com.dev.lesson18.weapon.Sword;
import com.dev.lesson18.weapon.Weapon;

/** Collection - shift-shift - ВВЕДЕНИЕ. */
/** Какие есть интерфейсы коллекции ? */
/** Ctrl + H - открыть иерархию наследования для текущего класса. */

/** 19.2 - Оценка сложности алгоритмов. Big O notation. */

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Леголас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Терминатор", 10);
        warrior.setWeapon(new Sword());

        // printWeaponDamage(archer);
        printWeaponDamage(warrior);

    }
    /** Параметризация на уровне метода. */
    /**
     * Два одининаковых параметрезированный методов написанные по разному.
     * public static void printWeaponDamage(Hero'<'? extends Weapon> hero)
     * public static void printWeaponDamage(Hero'<'? super Weapon> hero)
     * super - ограничения Generic с низу.
     * public static <T extends Weapon> void printWeaponDamage(Hero<T> hero)
     */

    /** extends - используется для producers.
     */
    /**
     * super - используется для consumers.
     */

    public static void printWeaponDamage(Hero<? extends Sword> hero) {
        Sword weapon = hero.getWeapon();
        System.out.println(hero.getWeapon().getDamage());
    }
}
