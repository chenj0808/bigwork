package com.wby;

import com.wby.article.WeaponKnife;
import com.wby.article.WeaponSword;
import com.wby.creature.Person;
import com.wby.creature.PlayingBogy;
import com.wby.creature.PlayingBogySet;

import java.util.Scanner;

/**
 * @description:
 * @author: weibaoyi
 * @date: Created in 2020/6/10
 * @version: v1.0
 */
public class Sense {
    private Person person=new Person();
    private PlayingBogy PlayingBogyA=new PlayingBogy();
    private PlayingBogy PlayingBogyB=new PlayingBogy();
    private PlayingBogy PlayingBogyC=new PlayingBogy();
    private PlayingBogySet PlayingBogySet =new PlayingBogySet();
    Ui ui=new Ui();

    public void initSense(){
        initMonster();
        initPerson();
    }
    public void initPerson(){
        person.setId("201902193");
        person.setDescription("天下第一");
        person.setHP(300);
        person.setCurrentWeapon(new WeaponSword("pw1","长剑",-50));
    }
    public  void initMonster(){
        PlayingBogyA.setId("bogyA");
        PlayingBogyA.setDescription("妖怪A");
        PlayingBogyA.setHP(200);
        PlayingBogyA.setCurrentWeapon(new WeaponKnife("PlayingBogyA","突袭A",-30));

        PlayingBogyB.setId("bogyB");
        PlayingBogyB.setDescription("妖怪B");
        PlayingBogyB.setHP(200);
        PlayingBogyB.setCurrentWeapon(new WeaponKnife("playingBogyB","突袭B",-30));

        PlayingBogyC.setId("bogyC");
        PlayingBogyC.setDescription("妖怪C");
        PlayingBogyC.setHP(200);
        PlayingBogyC.setCurrentWeapon(new WeaponKnife("playingBogyC","突袭C",-30));

        playingBogySet.getMonsterWolves().add((PlayingBogyA));
        playingBogySet.getMonsterWolves().add(playingBogyB);
        playingBogySet.getMonsterWolves().add(playingBogyC);
    }

//    public boolean judgeSuccess() {
//        boolean flagPersonSuccess = true;
//
//        if (this.getPerson().getHP() <= 0) {
//            flagPersonSuccess = false;
//        }
//    }//判断胜负

    public void play(){
        ui.displayStaus(this);


        Scanner in=new Scanner(System.in);
        while (true){
            //用户输入命令
            String command=in.nextLine();
        
            String[] cmdLineItems =command.split(" ");

    
            if(cmdLineItems[0].equals("bye")){
                ui.displayBye();
                System.exit(0);
            }else if(cmdLineItems[0].equals(("help"))){
                ui.displayHelpMsg();
            }else if(cmdLineItems[0].equals("chop")){
                this.getPerson().useArticle(getPerson().getCurrentWeapon(),
                        this.getPlayingBogySet().get(cmdLineItems[1]));
                ui.dispalyInjuryMsg(this.getPerson(),this.getPlayingBogySet().get(cmdLineItems[1]));
                for(PlayingBogySet item:this.getPlayingBogySet().getMonsterWolves()){
                    if(1==Utils.randomMonsterChop()){
                        item.useArticle(item.getCurrentWeapon(),this.getPerson());
                        ui.dispalyInguryMsg(item,this.getPerson());
                    }else {
                    }
                }

                //妖怪随机砍人
            }else {
                ui.displayErroCmdMsg();
            }
            ui.displayStaus(this);
        }
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PlayingBogy getPlayingBogyA() {
        return playingBogyA;
    }

    public void setPlayingBogyA(PlayingBogy playingBogyA) {
        this.playingBogyA = playingBogyA;
    }

    public PlayingBogy getPlayingBogyB() {
        return playingBogyB;
    }

    public void setPlayingBogyB(PlayingBogy playingBogyB) {
        this.playingBogyB = playingBogyB;
    }

    public PlayingBogy getPlayingBogyC() {
        return playingBogyC;
    }

    public void setPlayingBogyC(PlayingBogy playingBogyC) {
        this.playingBogyC = playingBogyC;
    }

    public PlayingBogySet getPlayingBogySet() {
        return playingBogySet;
    }

    public void setPlayingBogySet(PlayingBogySet playingBogySet) {
        this.playingBogySet = playingBogySet;
    }

    public Ui getUi() {
        return ui;
    }

    public void setUi(Ui ui) {
        this.ui = ui;
    }
}
