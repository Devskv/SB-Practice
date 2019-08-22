package com.devuse.docker.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devuse.docker.entity.Ticket;
import com.devuse.docker.entity.TicketRepository;


@RestController
@RequestMapping("/rest")
public class HelloResource {
	
	@Autowired
	private TicketRepository ticketRepository;
	
    @GetMapping(value="/ping")
    public String hello(){
        return "Hello world ....";
    }
    
    @PostMapping("/load")
    public List<Ticket> addStation(@RequestBody  Ticket ticket) {
    	ticketRepository.save(ticket);
        return (List<Ticket>) ticketRepository.findAll();
    }
}
