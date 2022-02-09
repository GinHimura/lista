package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employeses wil be registered? ");
		int n = sc.nextInt();
		
		List<Employees> list = new ArrayList<>(); 
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nEmplyoee #" + (i + 1) +": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
		    double salary = sc.nextDouble();
		    list.add(new Employees(id, name, salary)); 
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");  
		int id = sc.nextInt();
		
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null); 
		if(emp == null) { 
			System.out.println("This id does not exist!");
		} else { 
			System.out.println("Enter the porcentage: ");
		double porcent = sc.nextDouble(); 
			emp.incraseSalary(porcent); 
		}
		
		System.out.println("\nList of employees: ");
		for (Employees obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
		
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
