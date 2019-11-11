import java.util.*;
public class Ogre extends Monster{

  public Ogre(){
    this.name = "Ogre";
    this.hp = 30;
    this.givenExp = 100;
  }

  public void appear(){
    System.out.println("Uh oh! A wild Ogre appeared!");
  }

  public int attack(){
    Random random = new Random();
    int damage = random.nextInt(8);
    return damage;
  }
}
