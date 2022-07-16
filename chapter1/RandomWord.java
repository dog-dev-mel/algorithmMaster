
/*
 * @Author: ITAIHAO
 *
 * @Date: 2022-07-16 12:04
 *
 */


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        String championWord = StdIn.readString();
        int currentWordIndex = 2;
        while (!StdIn.isEmpty()) {
            String tempWord = StdIn.readString();
            double possibility = 1.0 / (double) currentWordIndex;
            if (StdRandom.bernoulli(possibility)) {
                championWord = tempWord;
            }
            currentWordIndex++;
        }
        StdOut.print(championWord);
    }
}
