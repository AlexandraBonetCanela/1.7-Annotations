package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();
        workers.add(new RemoteWorker("Johan", "Abbot", new BigDecimal("12.50")));
        workers.add(new InOfficeWorker("Edward", "McMallan", new BigDecimal("12.50")));

        try {
            for (Worker worker : workers) {
                System.out.println(worker.getClass().getSimpleName() + " salary: " + worker.calculateSalary(new BigDecimal("80.5")));
            }
        }  catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}