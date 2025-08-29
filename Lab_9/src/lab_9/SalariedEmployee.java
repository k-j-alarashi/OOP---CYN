/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_9;

public class SalariedEmployee extends Employee {
    private double bouns ;
    private double dedction ;

    public SalariedEmployee(double bouns, double dedction, int id, String name, String job, double salary) {
        super(id, name, job, salary);
        this.bouns = bouns;
        this.dedction = dedction;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    public double getDedction() {
        return dedction;
    }

    public void setDedction(double dedction) {
        this.dedction = dedction;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getBouns() - getDedction() ;
    }

    @Override
    public String toString() {
        return super.toString()+
             "\nSALARY   : "+super.getSalary()+
             "\nBOUNS    : "+getBouns()+
             "\nDEDCTION : "+getDedction()+
             "\nTOTAL    : "+getSalary();
    }
    
    
    
}
