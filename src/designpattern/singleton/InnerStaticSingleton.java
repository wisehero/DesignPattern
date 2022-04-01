package src.designpattern.singleton;

import java.io.Serializable;

public class InnerStaticSingleton implements Serializable {

    private InnerStaticSingleton() {

    }

    public static InnerStaticSingleton getInstance() {
        return InnerClass.instance;
    }

    // 멀티쓰레드에 안전하고, Lazy Loading을 지원하며, Serialization에도 안전한 싱글톤을 만들 수 있다.
    private static class InnerClass {
        private static final InnerStaticSingleton instance = new InnerStaticSingleton();
    }
}
