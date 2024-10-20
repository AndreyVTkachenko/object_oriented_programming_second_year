package lesson.example_06;

public class Program {
    public static void main(String[] args) {

        // false
        // 0
        // 0
        // false
        // 2055281021
        // 1554547125
         Worker1 w1 = new Worker1("Имя", "Фамилия", 20, 20);
         Worker1 w2 = new Worker1("Имя", "Фамилия", 20, 20);

         System.out.println(w1 == w2);

         System.out.println(w1.compareTo(w2));
         System.out.println(w2.compareTo(w1));

         System.out.println(w1.equals(w2));

         System.out.println(w1.hashCode());
         System.out.println(w2.hashCode());

        // false
        // 0
        // 0
        // false
        // 1706377736
        // 468121027
         Worker2 w3 = new Worker2("Имя", "Фамилия", 20, 201);
         Worker2 w4 = new Worker2("Имя", "Фамилия", 20, 201);

         System.out.println(w3 == w4);

         System.out.println(w3.compareTo(w4));
         System.out.println(w4.compareTo(w3));

         System.out.println(w1.equals(w4));

         System.out.println(w3.hashCode());
         System.out.println(w4.hashCode());

         Worker3 w5 = new Worker3("Имя", "Фамилия", 20, 201);
         Worker3 w6 = w5;// new Worker3("Имя", "Фамилия", 20, 201);

         System.out.println(w5 == w6);
         System.out.println(w5.equals(w6));

         System.out.println(w5);
         System.out.println(w6);

         w5.age = 31;

         System.out.println(w5);
         System.out.println(w6);

    }
}
