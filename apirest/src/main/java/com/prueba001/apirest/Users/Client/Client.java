package com.prueba001.apirest.Users.Client;

import com.prueba001.apirest.Users.User;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Client extends User {
    private String dni;
    private String telefono;
}
