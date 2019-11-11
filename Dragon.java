import java.util.*;
public class Dragon extends Monster{

  public Dragon(){
    this.name = "Dragon";
    this.hp = 23;
    this.givenExp = 50;
  }

  public void appear(){
    System.out.println("Uh oh! A wild Dragon appeared!");
  }

  public int attack(){
    Random random = new Random();
    int damage = random.nextInt(6);
    return damage;
  }
}
