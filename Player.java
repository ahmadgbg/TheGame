import java.util.*;
public class Player{
  String name;
  int level;
  int hp;
  int exp;
  boolean alive;
  int maxExp;
  int maxHp;
  int gold;
  int strength;
  int toughness;

public Player(String name){
  this.name = name;
  this.level = 1;
  this.hp = 100;
  this.exp = 0;
  this.alive = true;
  this.maxExp = 200;
  this.maxHp = 100;
  this.gold = 0;
  this.strength = 0;
  this.toughness = 0;
}
public int attack(){
  Random random = new Random();
  int damage = 0;

    if(this.strength != 0){
      damage = random.nextInt((2*this.strength - 2) + 1) + 2;
    }else{
      damage = random.nextInt(8);
    }
  System.out.println("You hit the monster, dealing "+damage+" damage");
  return damage;
}
public String getName(){
  return this.name;
}
public int getHp(){
  return this.hp;
}
public int getLevel(){
  return this.level;
}
public int getExp(){
  return this.exp;
}
public int getGold(){
  return this.gold;
}
public void giveGold(int gold){
    this.gold = this.gold - gold;
}
public void takeGold(int gold){
  this.gold += gold;
}
public int getMaxExp(){
  return this.maxExp;
}
public int getStrength(){
  return this.strength;
}
public int getToughness(){
  return this.toughness;
}
public void addStrength(int strength){
  this.strength += strength;
}
public void addToughness(int toughness){
  this.toughness += toughness;
}
public void addExp(int exp){
  int oldExp = this.exp;
  this.exp += exp;
  if(this.exp >= 200 && this.exp < 300 && oldExp < 200){
    this.level = 2;
    this.maxExp = 300;
    this.hp = this.maxHp = 210;
    System.out.println("You got an level!");
  }else if(this.exp >= 300 && this.exp < 450 && oldExp < 300){
    this.level = 3;
    this.maxExp = 450;
    this.hp = this.maxHp = 220;
    System.out.println("You got an level!");
  }else if(this.exp >= 450 && this.exp < 600 && oldExp < 450){
    this.level = 4;
    this.maxExp = 600;
    this.hp = this.maxHp = 230;
    System.out.println("You got an level!");
  }else if(this.exp >= 600 && this.exp < 750 && oldExp < 600){
    this.level = 5;
    this.maxExp = 750;
    this.hp = this.maxHp = 240;
    System.out.println("You got an level!");
  }else if(this.exp >= 750 && this.exp < 950 && oldExp < 750){
    this.level = 6;
    this.maxExp = 950;
    this.hp = this.maxHp = 250;
    System.out.println("You got an level!");
  }else if(this.exp >= 950 && this.exp < 1200 && oldExp < 950){
    this.level = 7;
    this.maxExp = 1200;
    this.hp = this.maxHp = 260;
    System.out.println("You got an level!");
  }else if(this.exp >= 1200 && this.exp < 1500 && oldExp < 1200){
    this.level = 8;
    this.maxExp = 1500;
    this.hp = this.maxHp = 270;
    System.out.println("You got an level!");
  }else if(this.exp >= 1500 && this.exp < 1700 && oldExp < 1500){
    this.level = 9;
    this.maxExp = 1700;
    this.hp = this.maxHp = 280;
    System.out.println("You got an level!");
  }else if(this.exp >= 1700  && oldExp < 1700){
    this.level = 10;
    this.maxExp = 2000;
    this.hp = this.maxHp = 300;
    System.out.println("You got an level!");
  }
}
public boolean isAlive(){
  return this.alive;
}
public void setAlive(boolean alive){
  this.alive = alive;
}
public int getMaxHp(){
  return this.maxHp;
}
public void subHp(int damage){
  int actualDamage = 0;
  if(damage != this.toughness && damage > this.toughness){
    actualDamage = damage - this.toughness;
    this.hp = this.hp - actualDamage;
  }else{
    this.hp -= damage;
  }
  System.out.println("The monster hit you, dealing "+actualDamage+" damage");
  if(this.hp <= 0){
    this.alive = false;
  }
}
public void addHp(int hp){
  if(this.hp + hp < this.maxHp){
      this.hp += hp;
  }else{
    this.hp = this.maxHp;
  }

}

}
