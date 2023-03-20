import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class triangleClassifierTest {
@Test
    void testCase1(){
    int a = 3;
    int b= 3;
    int c= 3;
    String expected = "tam giác đều";
    String result = triangleClassifier.TriangleClassifier(a,b,c);
    assertEquals(expected,result);
}
    @Test
    void testCase2(){
        int a = 3;
        int b= 3;
        int c= 4;
        String expected = "tam giác cân";
        String result = triangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testCase3(){
        int a = 3;
        int b= 4;
        int c= 5;
        String expected = "tam giác thường";
        String result = triangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }

}