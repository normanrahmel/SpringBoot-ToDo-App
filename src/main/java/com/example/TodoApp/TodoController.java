package com.example.TodoApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;


@RestController
//@RestController ist eine Annotation, die die Klasse als Controller markiert und die Rückgabe der Methoden als JSON-Objekt interpretiert.
public class TodoController {

    @GetMapping("/todo")
    //GetMapping ist eine Annotation, die die Methode als GET-Request-Handler markiert.
    public ResponseEntity<Todo> get(@RequestParam(value = "id") int id) {
        //RequestParam ist eine Annotation, die die Methode als GET-Request-Handler markiert.
        Todo newTodo = new Todo();
        newTodo.setDescription("Ich muss aufs Klo");
        newTodo.setId(id);
        newTodo.setDone(true);


        return new ResponseEntity<Todo>(newTodo, HttpStatus.OK);
    }

    @PostMapping("/todo")
    //PostMapping ist eine Annotation, die die Methode als POST-Request-Handler markiert.
    public ResponseEntity<Todo> create(@RequestBody Todo newTodo) {
        //Save newTodo to database
        return new ResponseEntity<Todo>(newTodo, HttpStatus.OK);
    }

}
