package com.douma.luhnalgorithm;

public class InvalidNumberException extends RuntimeException
{
    InvalidNumberException()
    {
        super();
    }

    InvalidNumberException(String message)
    {
        super(message);
    }

    public static InvalidNumberException forNumber(String number)
    {
        return new InvalidNumberException("Not a number " + number);
    }
}
