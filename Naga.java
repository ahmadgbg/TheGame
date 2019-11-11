import java.util.*;
public class Naga extends Monster{

  public Naga(){
    this.name = "Naga";
    this.hp = 15;
    this.givenExp = 20;
  }

  public void appear(){
    System.out.println("Uh oh! A wild Naga appeared!");
  }

  public int attack(){
    Random random = new Random();
    int damage = random.nextInt(3);
    return damage;
  }
}
