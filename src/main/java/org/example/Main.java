package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

            LocalDate sc = LocalDate.now();
            System.out.println(sc);
            LocalDateTime sx = LocalDateTime.now();
            System.out.println(sx);
            Instant sr = Instant.now();
            System.out.println(sr);
            LocalDate sy = LocalDate.parse("2023-08-08");
            System.out.println(sy.toString());
            LocalDateTime su = LocalDateTime.parse("2023-09-20T15:41");
            System.out.println(su);
            Instant si = Instant.parse("2023-05-05T01:30:26-03:00");
            System.out.println(si);

    }
}