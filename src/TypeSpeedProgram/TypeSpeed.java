package TypeSpeedProgram;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TypeSpeed {
   public static void play() throws InterruptedException {

       String words[] = {"time","people","words","things","home","mother","light","father","help","head"};
       String typeWords;

       System.out.println("3");
       TimeUnit.SECONDS.sleep(1);
       System.out.println("2");
       TimeUnit.SECONDS.sleep(1);
       System.out.println("1");
       TimeUnit.SECONDS.sleep(1);

       Random rand = new Random();


       for(int i=0;i<=9;i++){
           System.out.print(words[rand.nextInt(9)]+" ");
       }
       System.out.println();

       double start = LocalTime.now().toNanoOfDay();
       Scanner sc = new Scanner(System.in);
       typeWords = sc.nextLine();
       double end = LocalTime.now().toNanoOfDay();
       double elapsedtimed = end - start;
       double seconds = elapsedtimed / 1000000000.0;

       int wpm = (int) ((((double)typeWords.length() / 5 ) / seconds ) * 60);

       System.out.print(wpm);











   }
}
