package HW2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class triangleTest {
    @Test
    @DisplayName("不等边三角形")
    public void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }

    @ParameterizedTest
    @CsvSource({
            "1,50,50,等腰三角形",
            "2,50,50,等腰三角形",
            "99,50,50,等腰三角形",
            "100,50,50,非三角形",
            "50,1,50,等腰三角形",
            "50,2,50,等腰三角形",
            "50,99,50,等腰三角形",
            "50,100,50,非三角形",
            "50,50,1,等腰三角形",
            "50,50,2,等腰三角形",
            "50,50,99,等腰三角形",
            "50,50,100,非三角形",
            "50,50,50,等边三角形",
    })
    public void generalBoundaryValue(int a,int b,int c,String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }

    @ParameterizedTest
    @CsvSource({
            "0,50,50,输入错误",
            "101,50,50,输入错误",
            "50,0,50,输入错误",
            "50,101,50,输入错误",
            "50,50,0,输入错误",
            "50,50,101,输入错误",
    })
    public void robustnessBoundary(int a,int b,int c,String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,1,等边三角形",
            "1,1,2,非三角形",
            "1,1,50,非三角形",
            "1,1,99,非三角形",
            "1,1,100,非三角形",
            "1,2,1,非三角形",
            "1,2,2,等腰三角形",
            "1,2,50,非三角形",
            "1,2,99,非三角形",
            "1,2,100,非三角形",
            "1,50,1,非三角形",
            "1,50,2,非三角形",
            "1,50,50,等腰三角形",
            "1,50,99,非三角形",
            "1,50,100,非三角形",
            "1,99,1,非三角形",
            "1,99,2,非三角形",
            "1,99,50,非三角形",
            "1,99,99,等腰三角形",
            "1,99,100,非三角形",
            "1,100,1,非三角形",
            "1,100,2,非三角形",
            "1,100,50,非三角形",
            "1,100,99,非三角形",
            "1,100,100,等腰三角形",
    })
    public void WorstCaseGeneralBoundary(int a,int b,int c,String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }

    @ParameterizedTest
    @CsvSource({
            "1,0,0,输入错误",
            "1,0,1,输入错误",
            "1,0,2,输入错误",
            "1,0,50,输入错误",
            "1,0,99,输入错误",
            "1,0,100,输入错误",
            "1,0,101,输入错误",
            "1,1,0,输入错误",
            "1,1,101,输入错误",
            "1,2,0,输入错误",
            "1,2,101,输入错误",
            "1,50,0,输入错误",
            "1,50,101,输入错误",
            "1,99,0,输入错误",
            "1,99,101,输入错误",
            "1,100,0,输入错误",
            "1,100,101,输入错误",
            "1,101,0,输入错误",
            "1,101,1,输入错误",
            "1,101,2,输入错误",
            "1,101,50,输入错误",
            "1,101,99,输入错误",
            "1,101,100,输入错误",
            "1,101,101,输入错误",
    })
    public void WorstCaseRobustness(int a,int b,int c,String expected) {
        Triangle triangle = new Triangle();
        assertEquals(expected, triangle.classify(a,b,c));
    }
}
