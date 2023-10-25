package Book;

import java.time.LocalDateTime;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook(10);
        Employee employee1 = new Employee("emp1", "32423423", LocalDateTime.of(2020, Month.AUGUST, 12, 12, 0));
        Employee employee2 = new Employee("emp2", "45656", LocalDateTime.of(2017, Month.MARCH, 15, 12, 0));
        Employee employee3 = new Employee("emp3", "3454565", LocalDateTime.of(2018, Month.AUGUST, 5, 12, 0));
        Employee employee4 = new Employee("emp4", "8765", LocalDateTime.of(1993, Month.MAY, 2, 12, 0));
        Employee employee5 = new Employee("emp5", "34435646", LocalDateTime.of(2021, Month.DECEMBER, 23, 12, 0));
        Employee employee6 = new Employee("emp6", "8777657", LocalDateTime.of(2022, Month.SEPTEMBER, 26, 12, 0));
        Employee employee7 = new Employee("emp6", "56456645", LocalDateTime.of(2015, Month.OCTOBER, 7, 12, 0));
        noteBook.add(employee1);
        noteBook.add(employee2);
        noteBook.add(employee3);
        noteBook.add(employee4);
        noteBook.add(employee5);
        noteBook.add(employee6);
        noteBook.add(employee7);
        System.out.println(noteBook.getByExp(2));
        System.out.println(noteBook.getByTel("emp2"));
        System.out.println(noteBook.getById(4));



    }
}
