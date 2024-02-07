package com.romm.events.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romm.events.entities.Event;
import com.romm.events.services.EventService;

@RestController
@RequestMapping(value="/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> findAll() {
        return eventService.findAll();
    }

    @PostMapping
    public Event saveEvent(@RequestBody Event event) {
        return eventService.saveEvent(event);
    }
}
