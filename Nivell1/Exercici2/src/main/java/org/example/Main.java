package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        RemoteWorker remoteWorker = new RemoteWorker("Johan", "Abbot", new BigDecimal("12.50"));

        InOfficeWorker inOfficeWorker = new InOfficeWorker("Edward", "McMallan", new BigDecimal("12.50"));

        runDeprecatedMethods(remoteWorker, inOfficeWorker);
    }

    @SuppressWarnings("deprecation")
    public static void runDeprecatedMethods(RemoteWorker remoteWorker, InOfficeWorker inOfficeWorker){
        System.out.println(remoteWorker.calculateSalary(new BigDecimal("80.5")));
        System.out.println(remoteWorker.calculateSalary(new BigDecimal("80.5"), new BigDecimal("50")));

        System.out.println(inOfficeWorker.calculateTotalPetrol(new BigDecimal("20"), new BigDecimal("6.50")));
        System.out.println(inOfficeWorker.calculateSalary(new BigDecimal("20"), new BigDecimal("8")));

    }
}