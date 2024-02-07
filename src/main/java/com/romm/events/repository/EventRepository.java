package com.romm.events.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romm.events.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}