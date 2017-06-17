package ua.study;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by admin on 3/28/2017.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one1", "wr", "three3", "four4", "five5", "six6"));

//        list.forEach(System.out::println);

//        list.forEach(e -> System.out.println(e.toUpperCase()));

//        int maxValue =  list.stream().map(e -> e.replaceAll("[^0-9]", ""))
//              .collect(Collectors.toList()).stream()
//              .map(e -> Integer.parseInt(e)).max(Integer::compareTo).get();


//        System.out.println(maxValue);
//
//        String maxLength = list.stream().min((e1, e2) -> e1.length() - e2.length()).get();
//        System.out.println(maxLength);
//
//        int maxValueIsEmpty = list.stream().map(e -> e.replaceAll("[^0-9]", "")).filter(e -> !e.isEmpty()).map(e -> Integer.parseInt(e)).max(Integer::compareTo).get();
//
//        System.out.println(maxValueIsEmpty);


        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person("anton", 20),
                new Person("ira", 32),
                new Person("petro", 45),
                new Person("roza", 22),
                new Person("roz", 22)));

        //������� ����������
//        System.out.println(people.stream().max((e1,e2) -> e1.getAge() - e2.getAge()).get());

        //������� ������������
//        System.out.println(people.stream().min((e1,e2) -> e1.getAge() - e2.getAge()).get());

        //������� � ���� �������� ��*�
//        System.out.println(people.stream().max((e1,e2) -> e1.getName().length() - e2.getName().length()).get());

        //���������� �� ����
//        people.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).forEach(System.out::println);


//        ���������� �� ��� � ����
//        people.stream().sorted((e1,e2) -> e1.getAge() - e2.getAge()).sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).forEach(System.out::println);

        // ���������� ������ � ����� ������ 30
//        System.out.println(people.stream().filter(e -> e.getAge() > 30).count());

        //�������� ������ ����� � ���� ����� ����� "�"
//        List<Person> list = people.stream().filter(e -> e.getName().contains("o"))
//          .collect(Collectors.toList());
//        System.out.println(list);

        // or

//        people.stream().filter(e -> e.getName().contains("o")).collect(Collectors.toList()).forEach(System.out::println);

        // ���������� ���� ����
//        System.out.println(people.stream().mapToInt(e -> e.getAge()).sum());

        // ���������� ������ �����������
//        System.out.println(people.stream().mapToInt(e -> e.getAge()).average().getAsDouble());

        // ��������� ����� ����� if else

//        people.stream().forEach(e -> {
//            if (e.getAge() > 30) {
//                e.isBigger();
//            }else{
//                e.isSmaller();
//            }
//            });


        // �������� ���������� ��� ����� ����� � ���� ������
        String allPeople = people.stream().map(Person::getName).
                collect(Collectors.
                        joining(", ", "person name : ' ", " '"));
        System.out.println(allPeople);

        //��������� ���� ��������� ���� � �������� �������
        ArrayList<String> names = people.stream().map(Person::getName)
                .collect(Collectors.toCollection(ArrayList::new));






    }

}
