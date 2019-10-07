
import java.util.Scanner;

public class Lucky7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        int tries = 0;
        int money;
        int highestroll = 1;
        System.out.print("Enter the amount of money you have > ");
        money = s.nextInt();
        int highestmoney = money;
        while (true) {
            d1.roll();
            d2.roll();
            tries++;
            int total = d1.getValue() + d2.getValue();
            if (total == 7) {
                money += 4;
                if (money > highestmoney) {
                    highestmoney = money;
                    highestroll = tries;
                }
            } else {
                money--;
            }
            if (money <= 0) {
                break;
            }
        }
        System.out.format("You are broke after %d rolls.\n", tries);
        System.out.format("You should have quit after %d rolls when you had $%d.", highestroll, highestmoney);
    }

}
