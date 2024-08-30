import java.io.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;

import static java.lang.System.in;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 engineer engg = new engineer();
 System.out.println("Employee id: "+ engg.id + "\nEmployee Position:" + engg.Software_engg);
    }
    }

class employee{
    int id;
    public employee() {
        Scanner ic = new Scanner(System.in);
        System.out.println("Enter the value of id:");
        this.id = ic.nextInt();
        int id = ic.nextInt();
    }

}
class engineer extends employee{
    public String Software_engg;
    //= "Software engineer";

    public engineer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the position:");
        this.Software_engg = scan.nextLine();
        String Software_engg = scan.nextLine();
    }
   // String position = Software_engg;
}