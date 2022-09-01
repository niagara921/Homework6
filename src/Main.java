import javax.swing.*;

public class Main {
    public static void main(String[] args) {
     int [] array = generateRandomArray();
      int result = 0;
      for(int i= 0; i< array.length; i++){
          System.out.println(result += array[i]);
      }
      int minArray = array[0];
      int maxArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minArray > array[i]){
                minArray = array[i];
            }
             if (maxArray < array[i]) {
                maxArray = array[i];
            }
            System.out.println("Минимальная сумма трат за день составила " + minArray + " рублей. Максимальная  сумма трат за день составила " + maxArray + " рублей");

            System.out.println("Средняя сумма трат за месяц составила " + (double)result / array.length + "  рублей");
        }
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i =reverseFullName.length-1; i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }

    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;


        }
    }