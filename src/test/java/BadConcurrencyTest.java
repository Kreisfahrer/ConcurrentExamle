import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BadConcurrencyTest {
    private Integer index;

    @Test
    public void test1() throws InterruptedException {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            index = i;
            numbers.add(index);
            System.out.println("Test_1 says " + index);
            Thread.sleep(500);
        }
        showResults(numbers);
    }

    @Test
    public void test2() throws InterruptedException {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 10; i > 0; --i) {
            index = i;
            numbers.add(index);
            System.out.println("Test_2 says " + index);
            Thread.sleep(500);
        }
        showResults(numbers);
    }

    private void showResults (List<Integer> numbers) {
        System.out.println();
        for (Number num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
