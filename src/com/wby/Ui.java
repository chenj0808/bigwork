package com.wby;

import com.wby.creature.Creature;
import com.wby.creature.PlayingBogy;

/**
 * @description:
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */
public class Ui {
    public void displayStaus(Sense sense){
        System.out.println("===============================");
        System.out.println("欢迎来到怪物世界！");
        System.out.println("你是一个冒险者，自诩天下第一，来到怪物世界历练");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("请输入:help查看游戏命令");
        System.out.println(sense.getPerson().getDescription()+":"+sense.getPerson().getHP());
        for (PlayingBogy item:sense.getPlayingBogySet().getMonsterWolves()){
            System.out.println(item.getId()+"("+item.getDescription()+"):"+item.getHP());

        }

        System.out.println("===============================");
    }
    public void displayHelpMsg(){
        System.out.println("3command:chop(chop wolf) bye help ");
    }
    public void displayBye(){
        System.out.println("再见");
    }
    public void displayErroCmdMsg(){
        System.out.println("你输入的是非法命令");
    }
    public void dispalyInjuryMsg(Creature attackCreature, Creature targetCreature){
        System.out.println(attackCreature.getDescription()+"对"+targetCreature.getDescription()
                +"造成"+attackCreature.getCurrentWeapon().getInjuryPoint()+"伤害。");
    }
}
