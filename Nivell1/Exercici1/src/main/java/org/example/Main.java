package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        RemoteWorker remoteWorker = new RemoteWorker("Johan", "Abbot", new BigDecimal("12.50"));
        System.out.println(remoteWorker.calculateSalary(new BigDecimal("80.5")));

        InOfficeWorker inOfficeWorker = new InOfficeWorker("Edward", "McMallan", new BigDecimal("12.50"));
        System.out.println(inOfficeWorker.calculateSalary(new BigDecimal("80.5")));
    }
}