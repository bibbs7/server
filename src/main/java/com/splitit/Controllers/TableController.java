package com.splitit.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.conditional.ElseAction;

import java.util.Optional;
import java.util.function.Function;

import javax.persistence.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

import com.splitit.Models.Tables;
import com.splitit.Models.User;
import com.splitit.Repository.TableRepository;

@RestController
@RequestMapping(path = "/tables") // This means URL's start with /demo (after Application path)
public class TableController<ImModel> {
    @Autowired // This means to get the bean called userRepository
               // Which is auto-generated by Spring, we will use it to handle the data
    private TableRepository tableRepository;

    
    TableController(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/add") // Map ONLY GET Requests
    public @ResponseBody HttpStatus addTable(@RequestBody int numSeats) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means 1111111111111111111111111it is a parameter from the GET
        // or POST request
        
        Tables t = new Tables();
        t.setnumSeats(numSeats);
        for (int i = 0; i < numSeats; i++) {
            t.setSeatId(i);
        	tableRepository.saveAndFlush(t);
        }
        //return tableRepository.getOne((long) t.getId());
       return HttpStatus.CREATED;
    }
    

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/{id}")
    public Optional<Tables> findById(@PathVariable final long id) {
        return tableRepository.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping(value = "/{id}")
    public <U> ResponseBuilder changeSeats(@PathVariable("id") long id, @RequestBody int newNumber) {

        Tables tableToChange = tableRepository.findById(id).get();
        int numActualSeats = tableToChange.getnumSeats();
        if (newNumber > numActualSeats) {
            int seatsToAdd = newNumber -  numActualSeats;
            tableRepository.findById(id).map((Function<? super Tables, ? extends U>) record -> {
                record.setnumSeats(newNumber);
                int idToAdd = numActualSeats + 1;
                for( int i = 0; i < seatsToAdd ; i++) {
                    record.setSeatId(idToAdd++);
                    tableRepository.saveAndFlush(record);
                }
                return null;

            });
        return Response.status(Status.CREATED);
    }   

            return  Response.status(Status.BAD_REQUEST);
}
  


    @CrossOrigin(origins = "http://localhost:3000")
  @DeleteMapping("/delete/{id}")
public ResponseEntity<?> deleteNote(@PathVariable(value = "id") Long id, @RequestBody Tables table ){
		Tables deletingTable = tableRepository.findById(id).get(); 
	if(deletingTable != null){
	tableRepository.delete(deletingTable);
	return  ResponseEntity.ok().build();
	}else
         return  ResponseEntity.notFound().build();
}
}
