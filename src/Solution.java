import java.lang.reflect.Proxy;

public class Solution {
    public static void main(String[] args) {
        SomeInterface someInterface = getProxy();
        someInterface.explosion();
    }

    public static SomeInterface getProxy() {
        SomeInterface original = new SomeClass();
        return (SomeInterface) Proxy.newProxyInstance(original.getClass().getClassLoader(), original.getClass().getInterfaces(), new CustomInvocationHandler(original));
    }

}
