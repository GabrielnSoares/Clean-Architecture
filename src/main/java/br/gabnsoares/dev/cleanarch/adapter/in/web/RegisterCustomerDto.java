package br.gabnsoares.dev.cleanarch.adapter.in.web;

import br.gabnsoares.dev.cleanarch.core.domain.Customer;

public record RegisterCustomerDto(String name) {

    public Customer toDomain() {
        return new Customer(null, name);

    }
}
