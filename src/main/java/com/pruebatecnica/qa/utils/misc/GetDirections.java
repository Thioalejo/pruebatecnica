package com.pruebatecnica.qa.utils.misc;

public class GetDirections {

    public static final String URL_BASE= "https://www.banistmo.com/wps/portal/banistmo/personas/";

    public static String of(String module){
        String url =null;
        switch (module){
            case "Bancolombia" :
                url= URL_BASE;
                break;
            default:
                System.out.println("No existe modulo buscado");
        }
        return url;
    }
}
