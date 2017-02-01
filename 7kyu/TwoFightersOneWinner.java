public class TwoFightersOneWinner {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    // Your code goes here. Have fun!
    String winner = "";
    System.out.println("Fighter 1 (Name, Health, DMG): " + fighter1.name + " " + fighter1.health +
                        " " + fighter1.damagePerAttack);

    System.out.println("Fighter 2 (Name, Health, DMG): " + fighter2.name + " " + fighter2.health +
                        " " + fighter2.damagePerAttack);

    System.out.println("first fighter is " + firstAttacker);

    do {

      if (firstAttacker.equals(fighter1.name))
      {
        // if fighter 1 goes
        fighter2.health -= fighter1.damagePerAttack;
        System.out.println(fighter1.name + " attacks " + fighter2.name + "; " +
                            fighter2.name + " now has " + fighter2.health + " health.");
        firstAttacker = fighter2.name;
      }
      else
      {
        // if fighter 2 goes
        fighter1.health -= fighter2.damagePerAttack;
        System.out.println(fighter2.name + " attacks " + fighter1.name + "; " +
                            fighter1.name + " now has " + fighter1.health + " health.");
        firstAttacker = fighter1.name;
      }



      if (fighter1.health <= 0)
        winner = fighter2.name;
      else if (fighter2.health <= 0)
        winner = fighter1.name;

    } while (fighter1.health > 0 && fighter2.health > 0);

    return winner;

  }
}
