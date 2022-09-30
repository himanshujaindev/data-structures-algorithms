package DataStructures.Collection.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Company implements Comparable<Company> {
    private String name;
    private int salary;

    Company(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", salary='" + getSalary() + "'" +
                "}";
    }

    @Override
    public int compareTo(Company c) {
        if(this.getSalary() > c.getSalary()) return 1;
        else return -1;
    }
}

public class sorting {

    public static void main(String[] args) {

        Random rand = new Random();

        // Sort Type = List of Integer; Ascending
        List<Integer> intList1 = new ArrayList<>(Arrays.asList(4, 2, 5));

        System.out.println(intList1);
        Collections.sort(intList1);
        System.out.println(intList1);

        // Sort Type = List of Integer; Descending
        List<Integer> intList2 = new ArrayList<>(Arrays.asList(4, 2, 5));

        System.out.println(intList2);
        Collections.sort(intList2, Collections.reverseOrder());
        System.out.println(intList2);

        // Sort Type = List of Strings; Ascending
        List<String> stringList1 = new ArrayList<>(Arrays.asList("Hi", "Bye", "Aaa"));

        System.out.println(stringList1);
        Collections.sort(stringList1);
        System.out.println(stringList1);

        // Sort Type = List of List of Integer; Ascending -> Using Comparator-compare
        List<List<Integer>> listIntList1 = new ArrayList<>();
        listIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));
        listIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));
        listIntList1.add(Arrays.asList(rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)));

        Comparator<List<Integer>> comparator1 = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(0) > o2.get(0))
                    return 1; // Sorting Based on 1st element; Ascending
                else
                    return -1;
            }
        };

        System.out.println(listIntList1);
        Collections.sort(listIntList1, comparator1);
        System.out.println(listIntList1);

        // Sort Type = List of List of Strings; Ascending -> Using Comparator-compare
        List<List<String>> listStringList1 = new ArrayList<>();
        listStringList1.add(Arrays.asList("Phone", "Bye"));
        listStringList1.add(Arrays.asList("Hello", "See"));
        listStringList1.add(Arrays.asList("Wave", "Ant"));

        Comparator<List<String>> comparator2 = new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                if (o1.get(1).compareTo(o2.get(1)) > 0)
                    return 1; // Sorting Alpha Based on 2st element; Ascending
                else
                    return -1;
            }
        };

        System.out.println(listStringList1);
        Collections.sort(listStringList1, comparator2);
        System.out.println(listStringList1);

        
        // Sort Type = List of object; Ascending -> Using Comparator-compare
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Google", 101));
        companies.add(new Company("Microsoft", 99));
        companies.add(new Company("Amazon", 102));

        /*
        Comparator<Company> comparator3 = new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                if (o1.getSalary() > o2.getSalary())
                    return 1;
                else
                    return -1;
            }
        };

        System.out.println(companies.toString());
        Collections.sort(companies, comparator3);
        System.out.println(companies.toString());
        
        */

        // Sort Type = List of object; Ascending -> Using Comparable-compareTo
        
        System.out.println(companies.toString());
        Collections.sort(companies);
        System.out.println(companies.toString());

    }

}
