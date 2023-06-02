package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int speed = input.nextInt();

if (speed>50){
    System.out.println("You're driving 50 mph over the limit. Slow down!");
}else if (speed>=0&&speed<=50){
    System.out.println("Speed is normal : "+speed);
}else {
    System.out.println("Invalid" );
}
    }
}
