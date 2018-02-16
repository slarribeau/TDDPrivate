package test;

import main.Return;
import org.junit.Test;

import java.lang.reflect.Method;

public class ReturnTest {
    @Test
    public void testAccessPrivateMethod() throws Exception {
        Return ret = new Return();
        Class<?> clazz = ret.getClass();
        Method method = clazz.getDeclaredMethod("rate");
        method.setAccessible(true);
        System.out.println(method.invoke(ret));
    }
}
