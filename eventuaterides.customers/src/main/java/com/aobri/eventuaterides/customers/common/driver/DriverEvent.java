package com.aobri.eventuaterides.customers.common.driver;


import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.aobri.eventuaterides.driversservice.backend.domain.Driver")
public interface DriverEvent extends Event {
}
