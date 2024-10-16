package org.example;

import java.math.BigDecimal;

public class InOfficeWorker extends Worker{

    private static final BigDecimal PETROL = new BigDecimal("65.59");

    public InOfficeWorker(String name, String surname, BigDecimal priceXHour) {
        super(name, surname, priceXHour);
    }

    @Override
    public BigDecimal calculateSalary(BigDecimal monthHoursWorked) throws IllegalArgumentException{

        if (monthHoursWorked.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        return super.calculateSalary(monthHoursWorked).add(PETROL);
    }
}
