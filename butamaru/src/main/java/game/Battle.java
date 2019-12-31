package game;

public class Battle{

    public Pig pig1;
    public Pig pig2;

    public Battle (Pig pig1, Pig pig2){
        this.pig1=pig1;
        this.pig2=pig2;
    }

    public void attack(){
        //戦闘
        while(this.pig1.hitPoint > 0 && this.pig2.hitPoint > 0){
            if(this.pig1.speed>this.pig2.speed){
              this.pig1.attack(this.pig2);
              if(this.pig2.hitPoint>0){
                this.pig2.attack(this.pig1);
              }
            }
            else{
              this.pig2.attack(this.pig1);
              if(this.pig1.hitPoint>0){
                this.pig1.attack(this.pig2);
              }
            }
          }
    }
}