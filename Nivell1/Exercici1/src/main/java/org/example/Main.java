package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        RemoteWorker remoteWorker = new RemoteWorker("Johan", "Abbot", new BigDecimal("12.50"));

        try {
            BigDecimal remoteWorkerSalary = remoteWorker.calculateSalary(new BigDecimal("80.5"));
            System.out.println("Remote worker salary: " + remoteWorkerSalary);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        InOfficeWorker inOfficeWorker = new InOfficeWorker("Edward", "McMallan", new BigDecimal("12.50"));

        try{
            BigDecimal inOfficeWorkerSalary = inOfficeWorker.calculateSalary(new BigDecimal("80.5"));
            System.out.println("In Office worker salary: " + inOfficeWorkerSalary);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}