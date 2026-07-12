package org.example;

public class DependencyInjectionTest {

    public static void main(String[] args) {

        CustomerRepository repository = new CustomerRepositoryImpl();

        CustomerService service = new CustomerService(repository);

        service.findCustomer(101);
    }
}