package org.example;

import java.math.BigDecimal;

public class RemoteWorker extends Worker {

    private static final BigDecimal FLAT_RATE_INTERNET = new BigDecimal("79.40");

    public RemoteWorker(String name, String surname, BigDecimal priceXHour) {
        super(name, surname, priceXHour);
    }

    @Override
    public BigDecimal calculateSalary(BigDecimal monthHoursWorked) {
        return priceXHour.multiply(monthHoursWorked).add(FLAT_RATE_INTERNET);
    }

    @Deprecated
    public BigDecimal calculateSalary(BigDecimal monthHoursWorked, BigDecimal plusElectricity) {
        return priceXHour.multiply(monthHoursWorked).add(FLAT_RATE_INTERNET).add(plusElectricity);
    }
}
