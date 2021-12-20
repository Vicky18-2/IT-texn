package com.ITtexn.pz3.service.film;

import javax.xml.ws.WebFault;

@WebFault
public class FilmException extends Exception{
    public FilmException() {
        super("The specified employee does not exist");
    }

    public FilmException(String str) {
        super(str);
    }
}
