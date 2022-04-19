import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] inputNumbers = {5, 4, 3, 2, 1};


        for(int j = 0; j < inputNumbers.length; j++){
            if(j != inputNumbers.length - 1){
                System.out.println(inputNumbers[j]*inputNumbers[j+1]);
            } else {
                System.out.println(inputNumbers[j]*inputNumbers[0]);
            }
        }

        int[] numbers = {5, 4, 3, 2, 1};
        int i = 0;
          while (i < numbers.length){
            System.out.println(i != numbers.length -1? numbers[i]*numbers[i+1] : numbers[i]*numbers[0]);
            i++;
        }


        //Second exercise
        int[] input = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(input));

        int[] output = new int[5];
        int oppositeIndex = input.length - 1;

        for(int k = 0; k < input.length; k++){
         output[k] = input[oppositeIndex--];
        }

        System.out.println(Arrays.toString(output));
    }
}
