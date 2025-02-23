package com.stub.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@NoArgsConstructor
public class User {
    private String login;
    private String password;
    private LocalDateTime currentDateTime;
}
