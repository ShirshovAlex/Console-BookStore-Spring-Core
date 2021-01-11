package by.bookstore.console;

import by.bookstore.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Bootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Application consoleApplication = (Application) annotationConfigApplicationContext.getBean("consoleApplication");
        consoleApplication.start();
        annotationConfigApplicationContext.close();
    }
}
