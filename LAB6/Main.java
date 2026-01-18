package LAB6;

import LAB6.Cache.CacheExample;
import LAB6.Cache.CacheProcessor;
import LAB6.Default.DefaultProcessor;
import LAB6.Default.ExampleDefaultClass;
import LAB6.Invoke.InvokeClass;
import LAB6.Invoke.InvokeProcessor;
import LAB6.ToString.Person;
import LAB6.ToString.ToStringProcessor;
import LAB6.Two.TwoExample;
import LAB6.Two.TwoProcessor;
import LAB6.Validate.ExampleValidateClass;
import LAB6.Validate.ValidateProcessor;

/**
 * Главный класс программы (демонстрация обработки аннотаций).
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Задание 1 ===");
        InvokeClass demo = new InvokeClass();
        InvokeProcessor.process(demo);

        System.out.println("\n=== Задание 2 ===");
        DefaultProcessor.process(ExampleDefaultClass.class);

        System.out.println("\n=== Задание 3 ===");
        Person p = new Person();
        System.out.println(ToStringProcessor.buildString(p));

        System.out.println("\n=== Задание 4 ===");
        ValidateProcessor.process(ExampleValidateClass.class);

        System.out.println("\n=== Задание 5 ===");
        CacheProcessor.process(CacheExample.class);

        System.out.println("\n=== Задание 6 ===");
        TwoProcessor.process(TwoExample.class);
    }
}