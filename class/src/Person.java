// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Person {
    private static int number;

    private String name;
    private int age;
    private String sex;
    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        number++;
    }
    public static int getNumber(){
        return number;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSex(){
        return this.sex;
    }
}