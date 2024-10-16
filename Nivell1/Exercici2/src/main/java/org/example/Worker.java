package org.example;

import java.math.BigDecimal;

public abstract class Worker {

    protected String name;
    protected String surname;
    protected BigDecimal priceXHour;

    public Worker(String name, String surname, BigDecimal priceXHour) {
        this.name = name;
        this.surname = surname;
        this.priceXHour = priceXHour;
    }

    public BigDecimal calculateSalary(BigDecimal hoursWorked) {
        return priceXHour.multiply(hoursWorked);
    }
}
