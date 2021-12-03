package com.company;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee emp) {
        // employee нысандарын id өрісінің мәні бойынша кішіден үлкенге дейін сұрыптайық
// нысандардың әр салыстыруы бойынша теріс санды, 0 немесе оң санды қайтарамыз
// мұнда біз бір объектінің өріс мәнін басқа объектінің өріс мәнінен алып тастаймыз
// нәтижесінде біз жоғарыда сипатталған нұсқалардың 3 нұсқасының 1-ін аламыз
        return (this.id - emp.id);
    }

    @Override
    // әдісті келесідей етіп қайта анықтаңыз
// ол объект туралы ақпаратты оқылатын түрде қайтарады
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" + this.salary + "]";
    }

    // Comparator жалақы бойынша нысандар тізімін немесе массивін сұрыптау үшін салыстыру
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    //Comparator жас бойынша нысандар тізімін немесе массивін сұрыптау үшін салыстыру
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    //Comparator есімі бойынша нысандар тізімін немесе массивін сұрыптау үшін салыстыру
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
}
