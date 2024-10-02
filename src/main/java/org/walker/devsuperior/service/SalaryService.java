package org.walker.devsuperior.service;

import org.walker.devsuperior.entity.Employee;

public class SalaryService {
    private final TaxService taxService;
    private final PensionService pensionService;


    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }

    public double netSalary(Employee employee) {  //netSalary=salarioLiquido
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }
}
