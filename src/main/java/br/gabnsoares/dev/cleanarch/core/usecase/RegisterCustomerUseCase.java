package br.gabnsoares.dev.cleanarch.core.usecase;

import br.gabnsoares.dev.cleanarch.core.domain.Customer;
import br.gabnsoares.dev.cleanarch.core.port.in.RegisterCustomerPortIn;
import br.gabnsoares.dev.cleanarch.core.port.out.CustomerRepositoryPortOut;

import java.util.UUID;

public class RegisterCustomerUseCase implements RegisterCustomerPortIn {

    private final CustomerRepositoryPortOut customerRepositoryPortOut;

    public RegisterCustomerUseCase(CustomerRepositoryPortOut customerRepositoryPortOut) {
        this.customerRepositoryPortOut = customerRepositoryPortOut;
    }

    @Override
    public UUID execute(Customer customer) {
        customerRepositoryPortOut.save(customer);
        return null;
    }
}
