package com.arpiatecnologia.resource;

import com.arpiatecnologia.model.Cliente;
import com.arpiatecnologia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody Cliente cliente) {
        return this.repository.save(cliente);
    }

    @PutMapping
    public Cliente update(@RequestBody Cliente cliente) {
        return this.repository.save(cliente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
       this.repository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Cliente readById(@PathVariable Long id) {
        return this.repository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Cliente> readAll() {
        return this.repository.findAll();
    }
}
