package ru.serobyan.json.lexer.token;

import lombok.Value;

@Value
public class Colon implements Token {

    @Override
    public String toString() {
        return ":";
    }

}