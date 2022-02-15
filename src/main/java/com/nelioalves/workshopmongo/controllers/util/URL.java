package com.nelioalves.workshopmongo.controllers.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {

    //função para fazer o "encode" do RequestParam, e não deixar o " " dar pau na requisição
    //transforma "bom dia" -> "bom%20dia"
    public static String decodeParam(String text){
        try {
            return URLDecoder.decode(text, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return "";
        }
    }
}
