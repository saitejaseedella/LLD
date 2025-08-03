package com.lld.tic_tac_toe.models;

import lombok.Data;

@Data
public class Symbol {

    private char symbolChar;
    private String avatar;

    public Symbol(char symbolChar, String avatar){
        this.avatar=avatar;
        this.symbolChar=symbolChar;
    }
}
