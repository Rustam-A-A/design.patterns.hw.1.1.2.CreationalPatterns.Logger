import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void filterOut(List<Integer> source, int treshold) {
        Logger logger = Logger.getInstance();
        List<Integer> result = source.stream()
                .filter(x -> x > treshold )
                .collect(Collectors.toList());
        logger.log("filtered out");
        logger.log("printing out the filtred collection");
        System.out.println(result);

    }
}
