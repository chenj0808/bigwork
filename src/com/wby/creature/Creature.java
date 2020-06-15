package com.wby.creature;

import com.wby.article.Weapon;

import java.util.ArrayList;

/**
 * @description:
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */

public abstract class Creature {
    private  String id;
    private  String description;
    private int HP;

    private Weapon currentWeapon;
    private ArrayList<Weapon>weapons=new ArrayList<>();//人可以换武器

    public abstract void  useArticle(Weapon weapon,Creature targetCreature);

    public  Creature(){

    }
    public Creature(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Creature(String id, String description, int HP) {
        this.id = id;
        this.description = description;
        this.HP = HP;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
}
