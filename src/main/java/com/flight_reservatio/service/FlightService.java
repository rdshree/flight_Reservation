package com.flight_reservatio.service;

import com.flight_reservatio.entity.Flight;
import com.flight_reservatio.service.serviceImpl.FlightServiceImpl;

import java.util.List;

public interface FlightService  {
    Flight addFlight(Flight flight);
    List<Flight> getAllFlights();
    Flight getFlightById(Long id);
    Flight saveFlight(Flight flight);
    void deleteFlight(Long id);
}
