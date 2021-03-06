//package edu.njit.cs602.s2018.assignments;

/**
 * Created by Ravi Varadarajan on 2/22/2018.
 */
public class SimpleCacheItem implements Cacheable<String> {

    private final String name;
    private int annualSalary;

    public SimpleCacheItem(String name, int annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
    }

    @Override
    public String getKey() {
        return name;
    }


    public int getAnnualSalary() {
        return annualSalary;
    }

    @Override
    public String toString() {
        return "Salary for "+name+" : "+annualSalary;
    }
}
