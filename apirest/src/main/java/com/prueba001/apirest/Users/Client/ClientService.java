package com.prueba001.apirest.Users.Client;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ClientService {
    private final ClientRepository clientRepository;

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
    public void updateClient(Client client) {
        clientRepository.save(client);
    }
}
