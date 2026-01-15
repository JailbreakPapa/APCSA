
public class ArrEssential {
    public static void main(String[] args){
        int[] numList = new int[25];

        int numItems = 0;
        int max = numList[0];
        int min = numList[0];
        int tot = 0;
        for(int c = 0; c < 20; c++){
            numList[numItems] = 5 + (c * 10);
            numItems++;
        }

        for (int i = 0; i < numItems; i++) {
            System.out.print(numList[i] + " ");
        }
        System.out.println();

        double avg = (double) tot / numItems;
        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);
        System.out.println("Total:     " + tot);
        System.out.println("Average:   " + avg);

        // (999 - 196) + 1 = 804
        int randomLarge = (int)(Math.random() * 804) + 196; 
        numList[numItems] = randomLarge;
        numItems++; 
        
        System.out.println("Generated large random number: " + randomLarge);
        System.out.println();
        for (int i = 0; i < numItems; i++) {
            System.out.print(numList[i] + " ");
        }
        System.out.println("\n");

        int randomSmall = (int)(Math.random() * 196);
        
        numList[numItems] = randomSmall;
        numItems++;
        
        System.out.println("Generated small random number: " + randomSmall);
        System.out.println();
        
        for (int i = 0; i < numItems; i++) {
            System.out.print(numList[i] + " ");
        }
        System.out.println("\n");

        int targetValue = 5 + ((int)(Math.random() * 20) * 10);
        
        int foundIndex = -1;
        
        for (int i = 0; i < numItems; i++) {
            if (numList[i] == targetValue) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Randomly generated target value: " + targetValue);
        System.out.println("Found at index: " + foundIndex);
    }
}
