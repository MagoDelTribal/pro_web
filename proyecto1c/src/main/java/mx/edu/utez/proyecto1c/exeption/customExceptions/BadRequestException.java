package mx.edu.utez.proyecto1c.exeption.customExceptions;

public class BadRequestException extends RuntimeException{

    public BadRequestException(String message){
        super(message);

    }
}
