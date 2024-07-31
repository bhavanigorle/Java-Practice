package org.example.Java_Backend;

import java.io.IOException;

public class InvalidAgeException extends IOException {


    public InvalidAgeException(String message ) {
       super(message);
    }
}
