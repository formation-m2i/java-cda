package org.example.designPattern.adapter;

public class TemporaryEmployeeAdapter implements Employee{

    private TemporaryEmployee temporaryEmployee;

    public TemporaryEmployeeAdapter(TemporaryEmployee temporaryEmployee) {
        this.temporaryEmployee = temporaryEmployee;
    }

    @Override
    public String getName() {
        return temporaryEmployee.getName();
    }

    @Override
    public double getSalary() {
        return temporaryEmployee.getDailyRate()*30; // on considère qu'il sera payé sur 30 jours.
    }

    @Override
    public String getPosition() {
        return temporaryEmployee.getPosition();
    }
}
