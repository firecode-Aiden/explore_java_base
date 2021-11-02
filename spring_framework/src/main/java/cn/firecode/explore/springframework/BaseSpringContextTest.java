package cn.firecode.explore.springframework;

import cn.firecode.explore.springframework.config.MainConfiguration;
import cn.firecode.explore.springframework.service.BaseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Project explore_java_base
 * @Author flynn
 * @Date 2021/11/1
 */
public class BaseSpringContextTest {

    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
//        BaseService name = (BaseService) context.getBean("baseService");
//        System.out.println(name.getName());
        MyInvocation invocation = new MyInvocation();
        Say o = (Say) Proxy.newProxyInstance(Say.class.getClassLoader(), new Class[]{Say.class}, invocation);
        o.sayHello();
        o.sayBye();
        System.out.println("54456");

    }

    interface Say {
        String sayHello();
        String sayBye();
    }

    static class MyInvocation implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            String methodName = method.getName();
            if ("sayHello".equals(methodName)) {
                System.out.println(" 代理类执行..sayHello.");
                return "sayHello";
            }else if("sayBye".equals(methodName)){
                System.out.println(" 代理类执行..sayBye.");
                return "sayBye";
            }
            return "";
        }
    }
}
