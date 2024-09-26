import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        // Получаем объект Class для класса String
        Class<String> stringClass = String.class;

        // Получаем все публичные методы класса String
        Method[] methods = stringClass.getMethods();

        // Выводим имена всех методов
        System.out.println("Методы класса String:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}

