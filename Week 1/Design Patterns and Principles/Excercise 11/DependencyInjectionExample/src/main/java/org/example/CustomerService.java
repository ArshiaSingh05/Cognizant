package org.example;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void findCustomer(int id) {
        System.out.println(customerRepository.findCustomerById(id));
    }
}