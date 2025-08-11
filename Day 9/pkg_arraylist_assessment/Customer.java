package pkg_arraylist_assessment;

import java.util.*;

public class Customer {
	
	private int id;
	private String name;
	private String contact;
	private String location;
	
	
	public Customer(int id, String name, String contact, String location) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.location = location;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contact=" + contact + ", location=" + location + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(new Customer(1,"kiran","7756801304","Pune"));
		customerList.add(new Customer(2,"ravi","983879023","Kolhapur"));
		customerList.add(new Customer(3,"rohit","923892722","Satara"));
		customerList.add(new Customer(4,"sanket","227989781797","Pune"));
		customerList.add(new Customer(5,"abhi","280212637","Sangli"));
		customerList.add(new Customer(6,"atish","8879697823","Solapur"));
		
//		Collections.sort(customerList);
		
	     Iterator<Customer> iterator = customerList.iterator();
	      
	      while (iterator.hasNext()) {
	          System.out.println("--------------" + iterator.next());
	      }
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Remove Customer by using ID: ");
	      int id = sc.nextInt();
	      
	      Customer isRemoveId = null;
	      for(Customer c : customerList) {
	    	  if(c.getId() == id) {
	    		  isRemoveId =  c;
	    		  break;
	    	  }
	      }
	      
	      Iterator<Customer> newIterator = customerList.iterator();

	      while(newIterator.hasNext()) {
	          Customer c = newIterator.next();	  
	          System.out.println("c" + c);
	          System.out.println("By using the iterator again");
	      }

	      if(isRemoveId != null) {
	    	  customerList.remove(isRemoveId);
	    	  System.out.println("Customer Removed!!");
	      } else
	      {
	    	  System.out.println("Customer does not exists!");
	      }
	      
	      System.out.println("Customer List After Removal:");
			for (Customer c : customerList) {
				System.out.println(c);
			}

			
			System.out.print("Enter customer id to search: ");
			int  customerId = sc.nextInt(); 
			
			
	        boolean isFound = false;
	     
	      
	      for(Customer e: customerList) {
	    	  if(e.getId() == customerId) {
	    		  isFound = true;
	    		  System.out.println("Customer Found: "+ e.getId() +" "+ e.getName() + " "+e.getContact()+" "+e.getLocation());
	    		  break;
	    	  }
	      }
//	      "Customer C003 not found in the list"
	      if(!isFound) {
	    	  System.out.println("Customer "+ customerId +" not Found in the list");
	      }
	      
	      
	}

}
