package com.romm.events.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romm.events.entities.Event;
import com.romm.events.entities.User;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    public List<Event> findAllByUser(User user);
}