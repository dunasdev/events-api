package com.romm.events.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.romm.events.repository.EventRepository;
import com.romm.events.entities.Event;

@Service
public class EventService {
    
    @Autowired
    EventRepository eventRepository;

    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    public Event saveEvent(Event event) {
        return eventRepository.saveAndFlush(event);
    }
}
