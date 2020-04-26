package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue, Long> {

    // We do not have to write the detailed query as because Spring Data JPA , provides us the implementation of the
    // if the method is named like the Column name as following.
    ExchangeValue findByFromAndTo(String from, String to);
}
