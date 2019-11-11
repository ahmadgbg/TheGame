import java.util.*;

class TheGame{

  public static void gameMenu(Player player, Shop shop){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("1. Go adventuring");
    System.out.println("2. Show details about your character");
    System.out.println("3. Go to shop");
    System.out.println("4. Exit game");
    int value = input.nextInt();
    System.out.println();
    switch(value){
      case 1:
        gameAdventure(player);
        break;
      case 2:
        gamePlayerDetails(player);
        break;
      case 3:
        shop.gameShop(player);
        break;
      case 4:
        gameExit(player);
        break;
    }

  }
  public static void gamePlayerDetails(Player player){
    System.out.println("***********");
    System.out.println("* Name: "+player.getName());
    System.out.println("* Level: "+player.getLevel());
    System.out.println("* Hp: "+player.getHp()+"/"+player.getMaxHp());
    System.out.println("* Exp: "+player.getExp()+"/"+player.getMaxExp());
    System.out.println("* Strength: "+player.getStrength());
    System.out.println("* Toughness: "+player.getToughness());
    System.out.println("***********");

  }
  public static void gameAdventure(Player player){
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    Monster monster = null;
    String[] monsters = {"Dragon", "Elemental", "Gnome", "Naga", "Ogre"};
    String currentMonster = monsters[random.nextInt(5)];
    int playerHit = 0;
    int monsterHit = 0;
    if(currentMonster == "Dragon"){
       monster = new Dragon();
    }else if(currentMonster == "Elemental"){
       monster = new Elemental();
    }else if(currentMonster == "Gnome"){
       monster = new Gnome();
    }else if(currentMonster == "Naga"){
       monster = new Naga();
    }else{
       monster = new Ogre();
    }
    if(random.nextDouble() <= 0.9){
      int playerDamage = 0;
      int monsterDamage = 0;
      monster.appear();
      while(monster.isAlive() && player.isAlive()){
        playerDamage = player.attack();
        monster.subHp(playerDamage);
        playerHit += playerDamage;
        monster.slurp();
        monsterDamage = monster.attack();
        player.subHp(monsterDamage);
        monsterHit += monsterDamage;
        System.out.println(player.getName()+": "+player.getHp());
        System.out.println(monster.getName()+": "+monster.getHp());
        if(player.isAlive()){
          System.out.println("[Press enter to continue]");
          input.nextLine();
        } else {
          System.out.println("You were killed by the monster :(");
        }

      }
      if(!monster.isAlive()){
        System.out.println("You hit the monster, dealing "+playerHit+" damage");
        System.out.println("You killed the monster, gaining "+monster.getGivenExp()+" experience and "+monster.getGold()+" gold!");
        player.addExp(monster.getGivenExp());
        player.takeGold(monster.getGold());
        System.out.println("You are level "+player.getLevel()+", and you have "+player.getExp()+" exp, "+player.getHp()+" hp and "+player.getGold()+" gold");
        if(player.getLevel() == 10){
          System.out.println("Congratulations! You won The Game!");
          player.setAlive(false);
        }
      }

    }else{
      System.out.println("You see nothing but swaying grass all around you...");
      System.out.println("[Press enter to continue]");
      input.nextLine();
    }


  }

  public static void gameExit(Player player){
    System.out.println("Bye!");
    player.setAlive(false);
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String name;
    System.out.println("************************");
    System.out.println("* Welcome to The Game! *");
    System.out.println("************************");
    System.out.println("Enter your name: ");
    name = input.next();
    Player player = new Player(name);
    Shop shop = new Shop();
    while(player.isAlive()){
      gameMenu(player, shop);
    }



  }
}
