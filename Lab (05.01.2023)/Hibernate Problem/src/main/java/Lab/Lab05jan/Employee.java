package Lab.Lab05jan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // marking thisd class as entity

//specifies the table name where data ofthe entity is to persisted
@Table(name = "Employee_info")
public class Employee { // employee class
	@Id // marks identifier of class (primary key)
	private int emp_id;
	private String emp_FirstName, emp_LastName, emp_Email, emp_Add;
	private double emp_salary;

}
