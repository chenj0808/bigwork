package com.wby.creature;

import com.wby.creature.PlayingCard;

import java.util.ArrayList;

/**
 * @description:
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */
public class PlayingBogySet {
    private ArrayList<PlayingBogy>monsterWolves=new ArrayList<>();

    //增删改查
    public PlayingBogy get(String id){
        PlayingBogy monsterWolf=null;
        for (PlayingBogy item:monsterWolves){
            if(true==id.equals(item.getId())){
                monsterWolf=item;
                break;
            }
        }
        return monsterWolf;
    }


    public PlayingBogySet(){

    }

    public PlayingBogySet(ArrayList<PlayingBogy> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }

    public ArrayList<PlayingBogy> getMonsterWolves() {
        return monsterWolves;
    }

    public void setMonsterWolves(ArrayList<PlayingBogy> monsterWolves) {
        this.monsterWolves = monsterWolves;
    }
}
