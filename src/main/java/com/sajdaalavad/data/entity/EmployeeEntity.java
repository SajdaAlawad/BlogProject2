package com.sajdaalavad.data.entity;



import com.sajdaalavad.business.dto.EmployeeDto;
import lombok.*;

import javax.persistence.*;

//Lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//entity
@Entity
@Table(name="employees")
public class EmployeeEntity{
    @Id
    @SequenceGenerator(name="seq_employee",allocationSize = 1)
    @GeneratedValue(generator = "seq_employee",strategy = GenerationType.SEQUENCE)
    private Long empid;

   @ManyToOne
    private companyEntity company;

    @Column(name = "employee_name")
    public String employeeName;

    @Column(name = "employee_email")
    public String employeeEmail;

    @Column(name = "employee_age")
    public int employeeage;

    @Column(name = "employee_salary")
    public int employeesalary;

    @Column(name = "employee_workingyear")
    public int employeeworkingyear;

    public static EmployeeEntity from(EmployeeDto employeeDto){
        EmployeeEntity employee= new EmployeeEntity();
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmployeeEmail(employeeDto.getEmployeeEmail());
        employee.setEmployeeage(employeeDto.getEmployeeage());
        employee.setEmployeesalary(employeeDto.getEmployeesalary());
        employee.setEmployeeworkingyear(employeeDto.getEmployeeworkingyear());
        return employee;
    }
    public EmployeeEntity(int employeeage,int employeeworkingyear,int employeesalary){
        this.employeeage=employeeage;
        this.employeeworkingyear=employeeworkingyear;
        this.employeesalary=employeesalary;
    }

    public void salary(){
        if((2020-this.employeeworkingyear)>365){
            this.employeesalary=this.employeesalary*10/100;
        }
    }
    public void Bonus(){
        if(this.employeeage>=20 && this.employeeage<=25){
            this.employeesalary = this.employeesalary*10/100;
        }else if(this.employeeage>=26 && this.employeeage<=30) {
            this.employeesalary = this.employeesalary*8/100;
        }else if(this.employeeage>=31 && this.employeeage<=36) {
            this.employeesalary = this.employeesalary*5/100;
        }else {
            this.employeesalary=this.employeesalary*3/100;
        }
    }

    public String toString(){
        return "Employee{"+
                "employeeId=" + empid+
                ",employeeName=" + employeeName+'\''+
                ",employeeAge=" + employeeage+
                ",employeeName=" + employeesalary+
                ",employeeworkingyear=" + employeeworkingyear+
                ",company=" + company+
                '}';

    }
}