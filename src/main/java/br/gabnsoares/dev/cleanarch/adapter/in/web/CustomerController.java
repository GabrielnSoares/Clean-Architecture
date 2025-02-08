package br.gabnsoares.dev.cleanarch.adapter.in.web;

import br.gabnsoares.dev.cleanarch.core.port.in.RegisterCustomerPortIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final RegisterCustomerPortIn registerCustomerPortIn;

    public CustomerController(RegisterCustomerPortIn registerCustomerPortIn) {
        this.registerCustomerPortIn = registerCustomerPortIn;
    }

    @PostMapping
    public ResponseEntity<Void> registerCustomer(@RequestBody RegisterCustomerDto dto) {

        registerCustomerPortIn.execute(dto.toDomain()); // dto

        return ResponseEntity.ok().build();

    }
}
