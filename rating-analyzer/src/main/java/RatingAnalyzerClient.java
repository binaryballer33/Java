import com.RatingAnalyzerImplementation.AnalyzerStreamsImplementation;
import org.stats.RatingAnalyzer;

import java.util.Arrays;

public class RatingAnalyzerClient {
    public static void main(String[] args) {
        int[] ratings = {3, 5, 2, 3, 4, 1, 3, 4, 3};
        RatingAnalyzer analyzer = RatingAnalyzer.newInstance(ratings);

        System.out.println(analyzer.mean());
        System.out.println(analyzer.median());
        System.out.println(Arrays.toString(analyzer.mode()));

        System.out.println();
        // ==============================================================//

        int[] ratings2 = {2, 8, 10, 21, 23, 23, 38, 38};
        RatingAnalyzer analyzer2 = RatingAnalyzer.newInstance(ratings2);

        System.out.println(analyzer2.mean());
        System.out.println(analyzer2.median());
        System.out.println(Arrays.toString(analyzer2.mode()));

        System.out.println();
        // ==============================================================//


        int[] ratings3 = {3};
        RatingAnalyzer analyzer3 = RatingAnalyzer.newInstance(ratings3);

        System.out.println(analyzer3.mean());
        System.out.println(analyzer3.median());
        System.out.println(Arrays.toString(analyzer3.mode()));

        System.out.println();
        // ==============================================================//

        int[] ratings4 = {1, 2, 3};
        RatingAnalyzer analyzer4 = RatingAnalyzer.newInstance(ratings4);

        System.out.println(analyzer4.mean());
        System.out.println(analyzer4.median());
        System.out.println(Arrays.toString(analyzer4.mode()));
    }
}
