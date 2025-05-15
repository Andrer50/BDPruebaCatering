package com.prueba001.apirest.Users.Client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ClientController {

    @Autowired
    private final ClientService clientService;

    @PostMapping("/client")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        client.setRole("CLIENT");
        return ResponseEntity.ok(clientService.createClient(client));
    }
}
