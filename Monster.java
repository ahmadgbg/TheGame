import java.util.*;
public class Monster{
String name;
boolean alive = true;
int hp;
int givenExp;
int gold;

public Monster(){
  Random random = new Random();
  this.gold = random.nextInt(100);
}
public void slurp(){
  System.out.println("UUuoooaah *slurp*");
}

public int getGold(){
  return this.gold;
}
public boolean isAlive(){
  return this.alive;
}
public String getName(){
  return this.name;
}
public int getGivenExp(){
  return this.givenExp;
}
public int getHp(){
  return this.hp;
}
public void subHp(int damage){
  this.hp = this.hp - damage;
  if(this.hp <= 0){
    this.alive = false;
  }
}
public void appear(){
  System.out.println("Uh oh! A wild ??? appeared!");
}

public int attack(){
  Random random = new Random();
  int damage = random.nextInt(100);
  return damage;
}

}
