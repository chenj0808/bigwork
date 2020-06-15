package com.wby.article;

import com.wby.article.Weapon;
import com.wby.creature.Creature;

/**
 * @description:
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */
public class WeaponKnife extends Weapon {
    public WeaponKnife(String id, String description, int injuryPoint) {
        super(id, description, injuryPoint);
    }
    @Override
    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHP(enemyCreature.getHP()+this.getInjuryPoint());
    }
}
