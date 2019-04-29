package com.aobri.eventuaterides.customers.common.customer;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.aobri.eventuaterides.customers.customersservice.backend.Customer")
public interface CustomerEvent extends Event {

}
