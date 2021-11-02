package cn.firecode.explore.javasebase;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @Project IntelliJ IDEA
 * @Author flynn
 * @Date 2021/11/1
 */
@DisplayName("主要类测试")
public class MainTest {

    @BeforeAll
    public static void init(){
        System.out.println("测试初始化...");
    }

    @BeforeEach
    public void eachTestInit(){
        System.out.println("每次测试都会执行");
    }

    @DisplayName("第一个测试")
    @Test
    public void testFirstTest(){
        System.out.println("第一个测试");
        MainTest mainTest = new MainTest();
        Assertions.assertNotNull(mainTest);
        // Assertions api相关文档： https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/Assertions.html

    }

    @DisplayName("第二个测试")
    @RepeatedTest(value = 3)
    public void testSecondTest(){
        System.out.println("第二个测试");
    }

    @ParameterizedTest
    @ValueSource(ints = {1})
    public void testParameterizedUnitTest(int num){
        System.out.println(num);
    }

    @Test
    public void timeoutTest(){
        Assertions.assertTimeout(Duration.of(3, ChronoUnit.SECONDS), ()->{
            Thread.sleep(600);
            System.out.println("timeout test excute");
        });
    }

    @Test
    public void timeoutTimePreemptively(){
        Assertions.assertTimeoutPreemptively(Duration.of(3, ChronoUnit.SECONDS), ()->{
            Thread.sleep(600);
            System.out.println("timeout test excute");
        });
    }

    @Test
    public void testGroupAssertions(){
        Assertions.assertAll(()->Assertions.assertEquals(1, 1), ()-> Assertions.assertEquals(2, 2));
    }
}
