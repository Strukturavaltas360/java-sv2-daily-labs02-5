package day01;

public class HumanMain {
    public static void main(String[] args) {

        Human h1 = new Human("Péter",32);
        Human h2 = new Human("Zoltán",28);
        Human h3 = new Human("Júlia",22);

        System.out.println(h1.getName()+" "+h1.getAge()+ " éves.");
        System.out.println(h2.getName()+" "+h2.getAge()+ " éves.");
        System.out.println(h3.getName()+" "+h3.getAge()+ " éves.");
    }
}
