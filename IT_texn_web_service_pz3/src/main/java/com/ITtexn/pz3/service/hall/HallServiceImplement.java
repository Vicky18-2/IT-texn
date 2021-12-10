package com.ITtexn.pz3.service.hall;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import javax.inject.Inject;


@WebService(endpointInterface = "com.ITtexn.pz3.service.hall.HallService")

public class HallServiceImplement implements HallService {

    @Inject
    protected HallCreation hallCreation;

    public HallServiceImplement(){
        this.hallCreation=new HallCreation();
    }

    @WebMethod
    public List<Hall> getAllHalls() {
        return hallCreation.getAllHalls();
    }


    @WebMethod
    public void insertHall(int idHall, String hallType, int columnQuantity, int seatQuantity) {
        hallCreation.insertHall(idHall,hallType, columnQuantity,seatQuantity);
    }

    @WebMethod
    public void updateHall(int idHall, String hallType, int columnQuantity, int seatQuantity) {
        hallCreation.updateHall(idHall,hallType, columnQuantity,seatQuantity);
    }

    @WebMethod
    public void deleteHall(int idHall) {
        hallCreation.deleteHall(idHall);
    }

    @WebMethod
    public void countHall() {
        hallCreation.countHall();
    }
}
