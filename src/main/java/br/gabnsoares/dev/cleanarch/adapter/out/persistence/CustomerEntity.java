package br.gabnsoares.dev.cleanarch.adapter.out.persistence;

import br.gabnsoares.dev.cleanarch.core.domain.Customer;
import jakarta.persistence.Entity;

@Entity
public class CustomerEntity {

    // @Id...

    public static CustomerEntity fromDomain(Customer customer) {
        return null;

    }
}
