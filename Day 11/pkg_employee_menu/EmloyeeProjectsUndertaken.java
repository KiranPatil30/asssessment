package pkg_employee_menu;

import java.util.Arrays;
import java.util.List;

public class EmloyeeProjectsUndertaken {
		
	private String[] projects;

	public EmloyeeProjectsUndertaken(String[] projects) {
		super();
		this.projects = projects;
	}

	public String[] getProjects() {
		return projects;
	}

	public void setProjects(String[] projects) {
		this.projects = projects;
	}

	
	public void display() {
		System.out.println("Project Undertaken");
		    for (String project : projects) {
		        System.out.println("! " + project);
		    }
	}
	
		
		
}
