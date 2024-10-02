package org.walker;

import org.walker.devsuperior.entity.Employee;
import org.walker.devsuperior.service.BrazilTaxService;
import org.walker.devsuperior.service.PensionService;
import org.walker.devsuperior.service.SalaryService;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Walker", 4000.00);
        SalaryService salaryService = new SalaryService(new BrazilTaxService(), new PensionService());
        System.out.println(salaryService.netSalary(employee));
    }
}