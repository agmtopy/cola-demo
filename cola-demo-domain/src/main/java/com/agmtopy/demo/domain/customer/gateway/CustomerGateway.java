package com.agmtopy.demo.domain.customer.gateway;

import com.agmtopy.demo.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
