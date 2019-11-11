import java.util.*;
public class Elemental extends Monster{

  public Elemental(){
    this.name = "Elemental";
    this.hp = 20;
    this.givenExp = 20;
  }

  public void appear(){
    System.out.println("Uh oh! A wild Elemental appeared!");
  }

  public int attack(){
    Random random = new Random();
    int damage = random.nextInt(6);
    return damage;
  }
}
