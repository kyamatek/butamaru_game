package game;

public class Pig{

    public String name;
    public int hitPoint;
    public int attack;
    public int defence;
    public int speed;

    public Pig (String name, int hitPoint, int attack, int defence, int speed){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
    }

    public void attack(Pig enemy){
        enemy.hitPoint = enemy.hitPoint - this.attack + (enemy.defence / 2);
    }
}