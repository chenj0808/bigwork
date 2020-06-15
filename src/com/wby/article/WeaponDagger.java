package com.wby.article;

import com.wby.article.Weapon;
import com.wby.creature.Creature;

/**
 * @description:匕首使用
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */

public class WeaponDagger extends Weapon {
//给敌人生命值造成伤害
    //匕首使用，修改enemyCreature的HP
    @Override
    public void useArticle(Creature enemyCreature) {
        enemyCreature.setHP(enemyCreature.getHP()+this.getInjuryPoint());
    }
}
