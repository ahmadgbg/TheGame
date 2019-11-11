import java.util.*;
public class Shop{
  public static void gameShop(Player player){
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome! What do you want to buy?");
    System.out.println("You have "+player.getGold()+" gold.");
    System.out.println();
    System.out.println("1. Attack amulet (+5 strength) - 100 gold.");
    System.out.println("2. Defense amulet (+2 toughness) - 100 gold");
    System.out.println("3. Health potion (+50 hp) - 50 gold");
    System.out.println("4. Exit shop");
    int value = input.nextInt();
    switch(value){
      case 1:
        if(player.getGold() >= 100){
        player.addStrength(5);
        player.giveGold(100);
        System.out.println("You bought an amulet. You can feel its power.");
        System.out.println("You have "+player.getGold()+" gold.");
      }else{
        System.out.println("Insufficient gold.");
      }
        break;
      case 2:
      if(player.getGold() >= 100){
      player.addToughness(2);
      player.giveGold(100);
      System.out.println("You bought an amulet. You feel warm and comfy.");
      System.out.println("You have "+player.getGold()+" gold.");
    }else{
      System.out.println("Insufficient gold.");
    }
        break;
      case 3:
        if(player.getGold() >=50){
          if(player.getHp() != player.getMaxHp()){
            player.addHp(50);
            player.giveGold(50);
            System.out.println("You bought an health potion. You feel rested.");
          }else{
            System.out.println("Your health is already full.");
          }
        }else{
          System.out.println("Insufficient gold.");
        }
        break;
      case 4:
        break;
    }

  }
}
