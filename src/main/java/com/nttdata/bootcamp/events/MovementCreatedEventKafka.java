package com.nttdata.bootcamp.events;


import com.nttdata.bootcamp.entity.Movement;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MovementCreatedEventKafka extends EventKafka<Movement> {

}
