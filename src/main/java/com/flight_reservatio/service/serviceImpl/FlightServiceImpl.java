package com.flight_reservatio.service.serviceImpl;

import com.flight_reservatio.entity.Flight;
import com.flight_reservatio.repository.FlightRepository;
import com.flight_reservatio.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {
    @Autowired
    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public Flight addFlight(Flight flight) {


        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlights() {
        return null;
    }

    @Override
    public Flight getFlightById(Long id) {
        return null;
    }

    @Override
    public Flight saveFlight(Flight flight) {
        return null;
    }

    @Override
    public void deleteFlight(Long id) {

    }


}
