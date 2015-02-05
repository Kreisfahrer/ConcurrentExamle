import org.testng.annotations.Test;

public class ConcurrentTest {

    @Test
    public void test1() throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Test_1 says " + i);
            Thread.sleep(500);
        }
    }

    @Test
    public void test2() throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Test_2 says " + i);
            Thread.sleep(500);
        }
    }

    @Test
    public void test3() throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Test_3 says " + i);
            Thread.sleep(500);
        }
    }

    @Test
    public void test4() throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Test_4 says " + i);
            Thread.sleep(500);
        }
    }

    @Test
    public void test5() throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Test_5 says " + i);
            Thread.sleep(500);
        }
    }

    @Test
    public void test6() throws InterruptedException {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Test_6 says " + i);
            Thread.sleep(500);
        }
    }
}
