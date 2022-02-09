package entities;

public class Employees {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employees(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void incraseSalary(double porcentage) {
		salary += salary * porcentage / 100;
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

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f",salary);
	} 
	
	
}


