package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Startup {

    public static void main(String[] args) {
//        List employees = new ArrayList();
        List<Employee> employees = new ArrayList<Employee>();
        Employee e1 = new Employee("Perez","Andrew","111-11-1111");
        Employee e2 = new Employee("Malasuk","Joss","666-66-6666");
        Employee e3 = new Employee("Malasuk","Joss","666-66-6666");
        Employee e4 = new Employee("Lombardo","Jim","999-99-9999");
        
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        
        //System.out.println(employees.size());
        
        Employee e5 = (Employee)employees.get(2);
        //System.out.println(e5.toString());
        
//        for(int i=0; i<employees.size(); i++){
//            System.out.println(employees.get(i));
//        }
        
//        for(Employee e: employees){
//            System.out.println(e);
//        }
        
        Set<Employee> employeeSet = new HashSet<Employee>(employees);
        for(Employee e: employeeSet){
            System.out.println(e);
        }
        
        
        
        
        
        
        
        
//        Address a1 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        Address a2 = new Address("0234 Street", "Milwaukee", "222-222-2222");
//        Address a3 = new Address("9234 Street", "Milwaukee", "222-222-2222");
//        Address a4 = new Address("1234 Street", "Milwaukee", "222-222-2222");
//        
//        Set set = new HashSet();
//        set.add(a1);
//        set.add(a2);
//        set.add(a3);
//        set.add(a4);
//        
//        for(Object address : set) {
//            System.out.println(address);
//        }
        
//        System.out.println(a1);
//        System.out.println(a2);

//        if (a1.equals(a2)) {
//            System.out.println("The addresses are equal");
//        } else {
//            System.out.println("The addresses are NOT equal");
//        }
    }
}
