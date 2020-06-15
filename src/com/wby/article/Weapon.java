package com.wby.article;

import com.wby.creature.Creature;

/**
 * @description:
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */
public abstract class Weapon {
    private String id;
    private String description;
    private  int injuryPoint;

    public  abstract void useArticle(Creature enemyCreature);

public Weapon(){

}

    public Weapon(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Weapon(String id, String description, int injuryPoint) {
        this.id = id;
        this.description = description;
        this.injuryPoint = injuryPoint;
    }

    public String getId() {
        return id;
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

    public int getInjuryPoint() {
        return injuryPoint;
    }

    public void setInjuryPoint(int injuryPoint) {
        this.injuryPoint = injuryPoint;
    }
}
