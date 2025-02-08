package br.gabnsoares.dev.cleanarch.core.port.out;

import br.gabnsoares.dev.cleanarch.core.domain.Customer;

public interface CustomerRepositoryPortOut {

    void save(Customer customer);
}
