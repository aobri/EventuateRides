package com.aobri.eventuaterides.customers.commandside.common.customer;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.aobri.eventuaterides.customers.commandside.customersservice.backend.Customer")
public interface CustomerEvent extends Event {

}
