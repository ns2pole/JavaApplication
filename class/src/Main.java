public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("太郎", 20, "male");
        Person p2 = new Person("花子", 22, "female");

        System.out.println("名前：" + p1.getName() + " 年齢：" + p1.getAge() + " 性別：" + p1.getSex());
        System.out.println("名前：" + p2.getName() + " 年齢：" + p2.getAge() + " 性別：" + p2.getSex());
        System.out.println(Person.getNumber());
    }
}
