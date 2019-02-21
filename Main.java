import java.io.*;
import java.util.*;
public class Main{
public static void main(String[] args)
     {
         Novice novice = new Novice();
         Scanner scanner = new Scanner(System.in);
         Bag bag = new Bag();
         System.out.println("Welcome player ieie");
         System.out.println("=======How=to=play=======");
         System.out.println("press 1 to attack");
         System.out.println("press 2 to heal");
         System.out.println("press 3 to OpenBag");
         System.out.println("=======status display=======");
         System.out.println("Level:"+novice.getLevel());
         System.out.println("Hp:"+ novice.getHp());
         System.out.println("Money:"+novice.getMoney());
         System.out.println("============================");

         while(novice.hp != 0)
         {

            int bottom = scanner.nextInt();
            if(bottom == 1){
                novice.attack();
                bag.packitem();
            } 

            else if(bottom == 2) novice.heal();
            else if(bottom == 3) {
                bag.lookitem();
                novice.usepotion(bag.useitem(scanner.nextInt()));
                
            }
            System.out.println("============================");
            System.out.println("HP: "+ novice.getHp());
            System.out.println("Money:"+novice.getMoney());
            System.out.println("============================");
            
        }
        System.out.println("====Your===Death===");
    }

}
