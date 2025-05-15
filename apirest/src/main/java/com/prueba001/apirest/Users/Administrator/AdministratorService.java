package com.prueba001.apirest.Users.Administrator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AdministratorService {
    private final AdministratorRepository administratorRepository;
}
