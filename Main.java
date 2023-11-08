import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Respondents: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Answers: ");
        for(int i=0; i<n; i++) {
            int s = sc.nextInt();
            arr[i] = s;
        }

        bubbleSort(arr);
        printArray(arr);
        System.out.println(mean(arr));
        System.out.println(median(arr));
        System.out.println(modus(arr));
    }

    // print an array
    static void printArray(int[] anArray) {
        for(int i=0; i<anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
    }
    
    // selection sort
    static int[] selectionSort(int[] anArray) {

        for(int i=0; i<anArray.length-1; i++) {
            for(int j=i+1; j<anArray.length; j++) {
                if(anArray[i] > anArray[j]) {
                    int temp = anArray[j];
                    anArray[j] = anArray[i];
                    anArray[i] = temp;
                }
            }
        }
        return anArray;
    }

    // bubble sort
    static int[] bubbleSort(int[] anArray) {

        int pass = 1;
        boolean isSwap = false;
        do {
            isSwap = false;
            for (int i=0; i<(anArray.length-pass); i++) {
                if(anArray[i+1] < anArray[i]) {
                    int temp = anArray[i];
                    anArray[i] = anArray[i+1];
                    anArray[i+1] = temp;
                    isSwap = true;
                }
            }
            pass++;
        } while(isSwap);
        return anArray;
    }

    // insertion sort
    static int[] insertionSort(int[] anArray) {

        for(int i=1; i<anArray.length; i++) {
            int temp = anArray[i];
            int nextPos = i-1;
            while(nextPos >= 0 && anArray[nextPos] > temp) {
                anArray[nextPos+1] = anArray[nextPos];
                nextPos--;
            }
            anArray[nextPos+1] = temp;
        }
        return anArray;
    }

    // mean method
    static double mean(int[] anArray) {
        double sum = 0;
        for(int i=0; i<anArray.length; i++) {
            sum += anArray[i];
        }
        return sum/anArray.length;
    }

    // median method
    static double median(int[] anArray) {
        double median = 0;
        int i = anArray.length/2;
        if(anArray.length%2==0) {
            median = (anArray[i-1]+anArray[i])/2.0;
        }
        else {
            median = anArray[i];
        }
        return median;
    }

    // modus method
    static String modus(int[] anArray) {
        Map<Integer, Integer> arrmod = new HashMap<>();
        int max = 0;
        String mode = "";
        for(int i=0; i<anArray.length; i++) {
            if(arrmod.get(anArray[i]) == null) {
                arrmod.put(anArray[i], 1);
            }
            else {
                int count = arrmod.get(anArray[i]);
                count++;
                arrmod.put(anArray[i], count);

                if(count>max) {
                    max = count;
                    mode = "" + anArray[i];
                }
            }
        }
        int dupe = 0;
        for (int i : arrmod.values()) {
            if(i==max) {
                dupe++;
                if(dupe>1) {
                    mode = "Tidak memiliki modus";
                }
            }
            else if(max==0) {
                mode = "Tidak memiliki modus";
            }
        }
        return mode;
    }
}