package Model;

import java.time.LocalDate;

public class Order {
    private Long id;
    private LocalDate orderdate;
    private String Status;
    private Customer customer;
    private LocalDate deliveryDate;
}
