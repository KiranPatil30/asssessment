package pkg_collectionFramework;

import java.util.ArrayList;
import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Kiran","CSE"));
		list.add(new Employee(102, "Ravi","AI"));
		list.add(new Employee(103, "Abhi","ENTC"));
		list.add(new Employee(104, "Adharsh","CSE"));
		list.add(new Employee(105, "Vinayak","AI"));
		
		System.out.println("All Employee List");
		for(Employee e : list) {
			System.out.println(""+e);
		}
		
		System.out.println("Remove Employee by  using ID: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Employee ID to remove: ");
        int removeId = sc.nextInt();
        Employee toRemove = null;
        for (Employee emp : list) {
            if (emp.getId() == removeId) {
                toRemove = emp;
                break;
            }
        }
 
        if (toRemove != null) {
        	list.remove(toRemove);
            System.out.println("Employee removed.");
        } else {
            System.out.println("Employee with ID " + removeId + " not found.");
        }
 
        // Final List
        System.out.println("\nUpdated Employee List:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
		
        
        System.out.println("Serch EMployee  by using name:");
        String str = sc.nextLine();
        
        boolean isFound = false;
        for(Employee e : list) {
        	if(e.getName().equals(str)) {
        		isFound = true;
        		System.out.println("Employee Found: "+ e.getId() +" "+ e.getName() + " "+e.getDepartment());
        		break;
        	}
        }
        
        if(!isFound) {
        	System.out.println("Employee Not Found!!");
        }
        
        
        System.out.println("Remove Employee by using id: ");
        int z = sc.nextInt();
        
        Employee e= list.remove(z);
        System.out.println("removed: "+e);
        
		
		
		
	}

}
