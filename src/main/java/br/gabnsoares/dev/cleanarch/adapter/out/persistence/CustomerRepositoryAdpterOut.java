package br.gabnsoares.dev.cleanarch.adapter.out.persistence;

import br.gabnsoares.dev.cleanarch.core.domain.Customer;
import br.gabnsoares.dev.cleanarch.core.port.out.CustomerRepositoryPortOut;

public class CustomerRepositoryAdpterOut implements CustomerRepositoryPortOut {

    private final CustomerJpaRepository repository;

    public CustomerRepositoryAdpterOut(CustomerJpaRepository repository) {
        this.repository = repository;
    }


    @Override
    public void save(Customer customer) {

        var entity = CustomerEntity.fromDomain(customer);
        repository.save(entity);

    }
}
