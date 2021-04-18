import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("the program starts working");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the legnth of the new collection");
        int size= scanner.nextInt();
        logger.log("the size of the collection has been set up");

        System.out.println("Please enter the max value of the elements");
        int maxValue = scanner.nextInt();
        logger.log("the max value of the collection has been put");

        Random random = new Random();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(maxValue));
            logger.log("new element " + result.get(i) + " added to the original collection" );
        }
//        for (int j = 1; j != size;) {
//            logger.log("printing out the original collection");
//            System.out.println(result.get(j));
//            j++;
//        }

        System.out.println("Please enter the filter value");
        int treshold = scanner.nextInt();
        logger.log("the filter has been put");
        Filter.filterOut(result, treshold);
        logger.log("the program has been executed");

        scanner.close();
    }
}
