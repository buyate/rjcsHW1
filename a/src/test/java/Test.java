import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @org.junit.jupiter.api.Test
    public void testT(){
        //Triangle triangle = new Triangle();
        System.out.println("true");
         //assert triangle.classify(3,3,3).equals("输入错误"):"false";
    }

    @org.junit.jupiter.api.Test
    @DisplayName("输入错误")
    protected void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(0, 4, 5);
        assertEquals("输入错误", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("一般三角形")
    public void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("等腰三角形")
    public void isosceles_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 4);
        assertEquals("等腰三角形", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("等边三角形")
    public void equilateral_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 3, 3);
        assertEquals("等边三角形", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("a大于100")
    void a_more_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(110, 60, 60);
        assertEquals("输入错误", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("a小于1")
    void a_less_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(0, 4, 5);
        assertEquals("输入错误", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("b大于100")
    void b_more_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(60, 110, 60);
        assertEquals("输入错误", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("b小于1")
    void b_less_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(1, -1, 1);
        assertEquals("输入错误", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("c大于100")
    void c_more_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(60, 60, 110);
        assertEquals("输入错误", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("c小于1")
    void c_less_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(6, 6, -1);
        assertEquals("输入错误", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("a+b<c")
    void ab_less_c_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(1, 1, 5);
        assertEquals("非三角形", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("a+c<b")
    void ac_less_b_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(1, 3, 1);
        assertEquals("非三角形", type);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("b+c<a")
    void bc_less_a_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(11, 1, 3);
        assertEquals("非三角形", type);
    }
}
