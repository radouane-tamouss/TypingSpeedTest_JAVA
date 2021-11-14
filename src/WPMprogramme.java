import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMprogramme {
    public static void main(String[] args) throws InterruptedException {

        String[] words = {"argent", "rapid", "ecole", "superieure", "classe", "oracle", "html", "langue", "rapide", "Bounjour", "touts", "matin", "ici ", "travail", "gi", "java", "html", "exam", "matin", "soir", "cours", "date", "Lundi", "Semaine", "Pc Portable", "internet", "Programmation", "web", "mobile", "quite", "exucute", "projet", "license"};
        System.out.print("loading ");
        System.out.print(".");
        TimeUnit.SECONDS.sleep(1);
        System.out.print(" .");
        TimeUnit.SECONDS.sleep(1);
        System.out.println(" .");
        TimeUnit.SECONDS.sleep(1);
        Random rand = new Random();
        for (int i = 0; i < 14; i++) {
            System.out.print(words[rand.nextInt(32)] + " ");

        }
        System.out.println();
        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedwords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime / 1000000000.0;
        int numChars = typedwords.length();
        // gross wpm = (all-typed-entries/5)/time(minute)

        int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
        System.out.println("You Score is : " + wpm + "!");
    }
}
