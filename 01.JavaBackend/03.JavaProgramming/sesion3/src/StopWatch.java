import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StopWatch {
    private long startTime;
    private long endTime;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public void selectionSort(List array) {
        Collections.sort(array);
    }

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return endTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        List<String> list = new ArrayList<>(5);
        list.add("Hai");
        list.add("Hoa");
        list.add("Nga");
        list.add("Huy");
        list.add("Cu");
        stopWatch.start();
        stopWatch.selectionSort(list);
        stopWatch.end();
        System.out.print("Program execution time: " + stopWatch.getElapsedTime());
    }
}
