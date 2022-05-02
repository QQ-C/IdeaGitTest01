package project03.test.service;

import org.junit.Test;
import project03.test.domain.Employee;

import static org.junit.Assert.*;

/**
 * 对Project03项目中的Test中的 NameListService 进行测试
 */
public class NameListServiceTest {

    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee() {
        NameListService service = new NameListService();
        int id=101;
        try {
           Employee employee=service.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}