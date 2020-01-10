package examples;

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/*
 * Java. Examples from book Guskova
 *
 * @author Ruslan Razumouski
 * @version Jan 10, 2020
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
