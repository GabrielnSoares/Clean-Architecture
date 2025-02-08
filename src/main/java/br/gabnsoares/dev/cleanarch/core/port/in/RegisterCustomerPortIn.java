package br.gabnsoares.dev.cleanarch.core.port.in;

import br.gabnsoares.dev.cleanarch.core.domain.Customer;

import java.util.UUID;

public interface RegisterCustomerPortIn {

    UUID execute(Customer Customer);


}
