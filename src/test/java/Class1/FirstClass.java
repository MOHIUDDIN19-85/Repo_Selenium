package Class1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClass {
    //Annotation
    @Test

    public void method1() {
        System.out.println("Hello World");

        int a = 10;
        int b = 20;
        boolean res =b>a;
        Assert.assertTrue(res, "res is not expected");
    }
    @Test
    public void method2(){
        System.out.println("Method2");
    }
}
