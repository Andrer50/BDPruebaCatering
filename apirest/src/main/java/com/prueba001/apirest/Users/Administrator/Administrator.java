package com.prueba001.apirest.Users.Administrator;

import com.prueba001.apirest.Users.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Administrator extends User {
    private String cargo;
}
