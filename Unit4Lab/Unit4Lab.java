import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Unit4Lab {

    public static void main(String[] args) throws FileNotFoundException {

        // Part 4: data1.txt - words separated by ":"
        System.out.println("=== Part 4: data1.txt ===");
        Scanner scan1 = new Scanner(new File("data1.txt"));
        String line = scan1.nextLine();
        String[] words = line.split(":");
        for (String word : words) {
            System.out.println(word);
        }
        scan1.close();

        // Part 5a: data2.txt - all words in the nursery rhyme
        System.out.println("\n=== Part 5a: data2.txt - All Words ===");
        Scanner scan2a = new Scanner(new File("data2.txt"));
        ArrayList<String> allWords = new ArrayList<String>();
        while (scan2a.hasNext()) {
            allWords.add(scan2a.next());
        }
        scan2a.close();
        for (String word : allWords) {
            System.out.println(word);
        }

        // Part 5b: data2.txt - words from first line only
        System.out.println("\n=== Part 5b: data2.txt - First Line Words ===");
        Scanner scan2b = new Scanner(new File("data2.txt"));
        ArrayList<String> firstLineWords = new ArrayList<String>();
        if (scan2b.hasNextLine()) {
            String firstLine = scan2b.nextLine();
            String[] firstLineArr = firstLine.split(" ");
            for (String word : firstLineArr) {
                firstLineWords.add(word);
            }
        }
        scan2b.close();
        for (String word : firstLineWords) {
            System.out.println(word);
        }

        // Part 6: data3.txt - integer test scores
        System.out.println("\n=== Part 6: data3.txt - Test Scores ===");
        Scanner scan3 = new Scanner(new File("data3.txt"));
        ArrayList<Integer> scores = new ArrayList<Integer>();
        while (scan3.hasNextInt()) {
            scores.add(scan3.nextInt());
        }
        scan3.close();
        for (int score : scores) {
            System.out.println(score);
        }

        // Part 7: data4.txt - double GPA values
        System.out.println("\n=== Part 7: data4.txt - GPA Values ===");
        Scanner scan4 = new Scanner(new File("data4.txt"));
        ArrayList<Double> gpas = new ArrayList<Double>();
        while (scan4.hasNextDouble()) {
            gpas.add(scan4.nextDouble());
        }
        scan4.close();
        for (double gpa : gpas) {
            System.out.println(gpa);
        }
    }
}
