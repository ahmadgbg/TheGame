import java.util.*;
public class Gnome extends Monster{

  public Gnome(){
    this.name = "Gnome";
    this.hp = 18;
    this.givenExp = 25;
  }

  public void appear(){
    System.out.println("Uh oh! A wild Gnome appeared!");
  }

  public int attack(){
    Random random = new Random();
    int damage = random.nextInt(4);
    return damage;
  }
}
