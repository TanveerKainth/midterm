/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{

   public double Salary;
   public double bonus;
  public String emp;

    public double getSalary() {
        return Salary;
    }

    public String getEmp() {
        return emp;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }
      
     
    
    
    
}
