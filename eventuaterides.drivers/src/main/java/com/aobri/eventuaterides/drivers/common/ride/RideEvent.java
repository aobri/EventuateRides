package com.aobri.eventuaterides.drivers.common.ride;

import io.eventuate.EventEntity;

@EventEntity(entity = "com.aobri.eventuaterides.ridesservice.backend.domain.Ride")
public interface RideEvent {
}
