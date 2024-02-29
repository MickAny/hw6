package gb.hw6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private int iterations;
    List<Integer> statistic = new ArrayList<>();

    public Game(int iterations) {
        this.iterations = iterations;
        for (int i = 0; i < iterations; i++) {
            GameProcess gameProcess = new GameProcess();
            statistic.add(gameProcess.count);
        }
    }
}
