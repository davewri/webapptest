package ie.dublin.webapptest.dao;

import ie.dublin.webapptest.model.Employee;

import java.util.List;

public interface EmployeeDao {
    // Return a list containing all the employee object
    public List<Employee> findAll();

    // Return an employee with matching id
    public Employee findById(int id);

    // return a list of employees in a job title
    public List<Employee> findByJobTitle(int id);

    //Updating an existing employee - return the number of rows affected
    public int update(final Employee employee);

    public Employee create(final Employee employee);

    // Delete employee with matching id
    public int delete(int id);

    // return a list of employees matching search term
    public List<Employee> findBySearchText(String searchText);

}
