package com.ITtexn.pz3.service.hall;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface HallService {

    @WebMethod
    List<Hall> getAllHalls();

    @WebMethod
    void insertHall(int idHall, String hallType, int columnQuantity,int seatQuantity);

    @WebMethod
    void updateHall(int idHall,String hallType, int columnQuantity,int seatQuantity);

    @WebMethod
    void deleteHall(int idHall);

    @WebMethod
    int countHall();

}
