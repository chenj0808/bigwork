package com.wby.creature;

import com.wby.article.Weapon;

/**
 * @description:
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */
public class PlayingCard extends Creature {

    @Override
    public void useArticle(Weapon weapon, Creature targetCreature) {
weapon.useArticle(targetCreature);
    }
}
