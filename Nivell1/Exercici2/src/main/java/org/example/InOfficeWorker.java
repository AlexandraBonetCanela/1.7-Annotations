package org.example;

import java.math.BigDecimal;

public class InOfficeWorker extends Worker{

    private static final BigDecimal PETROL = new BigDecimal("65.59");

    public InOfficeWorker(String name, String surname, BigDecimal priceXHour) {
        super(name, surname, priceXHour);
    }

    @Override
    public BigDecimal calculateSalary(BigDecimal monthHoursWorked) {
        if (monthHoursWorked.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Hours worked cannot be negative.");
        }
        return super.calculateSalary(monthHoursWorked).add(PETROL);
    }

    @Deprecated
    public BigDecimal calculateTotalPetrol(BigDecimal daysWorked, BigDecimal monthPetrolPrice) {
        return daysWorked.multiply(monthPetrolPrice);
    }

    @Deprecated
    public BigDecimal calculateSalary(BigDecimal monthHoursWorked, BigDecimal totalToiletTime) {
        return monthHoursWorked.subtract(totalToiletTime).multiply(priceXHour);
    }
}
