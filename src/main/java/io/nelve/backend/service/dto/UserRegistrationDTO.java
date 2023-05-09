package io.nelve.backend.service.dto;


import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRegistrationDTO {

    String username;
    String email;
    String password;
    String firstName;
    String lastName;

}
