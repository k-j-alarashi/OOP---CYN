/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_9;

public class HourlyEmployee extends Employee {
    private int hourNum ;

    public HourlyEmployee(int hourNum, int id, String name, String job, double hourRate) {
        super(id, name, job, hourRate);
        this.hourNum = hourNum;
    }

    public int getHourNum() {
        return hourNum;
    }

    public void setHourNum(int hourNum) {
        this.hourNum = hourNum;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * getHourNum() ;
    }
    
    @Override
    public String toString() {
        return super.toString()+
             "\nHOUR RATE   : "+super.getSalary()+
             "\nHOUR NUM    : "+getHourNum()+
             "\nTOTAL    : "+getSalary();
    }
}
