package src;

import java.time.LocalDate;
import java.time.Period;

public class Person1 extends Contact1 {
    LocalDate dateOfBirth=LocalDate.of(2002,8,9);
    public int calculateAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}