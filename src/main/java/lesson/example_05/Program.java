package lesson.example_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random r = new Random();

        // #region Collections.sort(numbers);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(r.nextInt(20 - 1) + 1);
        }

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        // #endregion

        // #region Comparable<Worker>
        List<Worker> db1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db1.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt((31 - 18) + 18),
                    r.nextInt(10000)));
        }
        System.out.println(db1);

        Collections.sort(db1);
        // Array.sort(...)

        System.out.println(db1);
        // #endregion

        // #region Comparable<Worker>
        List<Worker> db2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            db2.add(new Worker("Имя " + i, "Фамилия " + i, r.nextInt((31 - 18) + 18), r.nextInt(10000)));
        }
        System.out.println(db2);

        db2.sort(new AgeComparator());

        System.out.println(db2);
        // #endregion

        //#region
        Worker w1 = new Worker("Имя", "Фамилия", 20, 20);
        Worker w2 = new Worker("Имя", "Фамилия", 20, 20);
        //#endregion

    }
}
