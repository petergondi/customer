package com.example.customer;

public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer=Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email()).build();
        customerRepository.save(customer);
    }
}