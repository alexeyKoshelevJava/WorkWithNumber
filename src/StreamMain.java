import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List <Integer> outputList = new ArrayList<>();

        for(int number : inputList ){
            if( number % 2 ==0 && number > 0){
                outputList.add(number);
            }

        }
        for (int y = 0; y < outputList.size() -1; y++ ){
            for (int i = 0; i < outputList.size()-1 - y; i++){
                if(outputList.get(i) > outputList.get(i + 1)){
                    int x = outputList.get(i);
                    outputList.set(i, outputList.get(i + 1));
                    outputList.set(i + 1, x);

                }
            }
        }

        System.out.println("Лист без изменений"+inputList);
        System.out.println("Лист после выборки"+ outputList);

    }
}
