package com.aobri.eventuaterides.rides.common.customer;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.aobri.eventuaterides.customersservice.backend.domain.Customer")
public interface CustomerEvent extends Event {

}
