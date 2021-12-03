package com.company;
import java.util.Arrays;
public class Main {
    // Біз массивтер мен тізімдерді comparable және Comparator интерфейстерінің көмегімен  сұрыптаймыз
    public static void main(String[] args) {
        // создаем массив объектов
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(7, "Adil", 19, 97500);
        empArr[1] = new Employee(12, "Kuanysh", 20, 28000);
        empArr[2] = new Employee(5, "Amir", 32, 48000);
        empArr[3] = new Employee(20, "Alex", 28, 52000);

        // массивті Comparable интерфейсімен сұрыптаңыз
        Arrays.sort(empArr);
        System.out.println("Стандартная сортировка:\n"+Arrays.toString(empArr));
        // Comparator салыстыру интерфейсін жалақы бойынша сұрыптау
        Arrays.sort(empArr, Employee.SalaryComparator);
        System.out.println("Comparator по зарплате:\n"+Arrays.toString(empArr));

        // Comparator салыстыру интерфейсін жас бойынша сұрыптау
        Arrays.sort(empArr, Employee.AgeComparator);
        System.out.println("Comparator по возрасту:\n"+Arrays.toString(empArr));

        // Comparator салыстыру интерфейсін есімі бойынша сұрыптау
        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println(" Comparator по имени:\n"+Arrays.toString(empArr));}}
