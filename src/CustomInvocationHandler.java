import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    SomeInterface origin;
    Object result;

    CustomInvocationHandler(SomeInterface origin) {
        this.origin = origin;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("the \"");
        result = method.invoke(origin, args);
        System.out.println("\" is neutralized");
        return result;
    }
}
