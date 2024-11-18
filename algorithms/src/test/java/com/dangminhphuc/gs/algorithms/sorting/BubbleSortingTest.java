package com.dangminhphuc.gs.algorithms.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class BubbleSortingTest {
    @Test
    public void testBasic() {
        int[] arr = {0, 1, 3, 2, 0};
        int[] expected = {0, 0, 1, 2, 3};

        BubbleSorting.sort(arr);

        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void testSortWithFlexible() {
        Integer[] arr = {0, 1, 3, 2, 0};
        Integer[] expected = {0, 0, 1, 2, 3};

        BubbleSorting.sort(arr, Integer::compareTo);

        Assertions.assertArrayEquals(expected, arr);
    }


    @Test
    public void testSortWithObject() {
        Person[] arr = {
                new Person("Jack", 15),
                new Person("Micheal", 20),
                new Person("John", 18),
        };
        Person[] expected = {
                new Person("Jack", 15),
                new Person("John", 18),
                new Person("Micheal", 20),
        };

        Comparator<Person> compareTo = Comparator.comparing(Person::getAge);
        BubbleSorting.sort(arr, compareTo);

        Assertions.assertArrayEquals(expected, arr, "The array should be sorted in ascending order");
    }

    private static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return age == person.age && name.equals(person.name);
        }
    }
}