package com.ITtexn.pz3.service.hall;

import java.util.List;

public class HallCreation extends Hall {

    private List<Hall> hallList;



    public List<Hall> getAllHalls() {
        return hallList;
    }

    public void insertHall(int idHall, String hallType, int columnQuantity,int seatQuantity) {
        Hall hall = new Hall(idHall,hallType,columnQuantity,seatQuantity);
        hallList.add(hall);
    }

    public void  updateHall(int idHall,String hallType, int columnQuantity,int seatQuantity){
        for(Hall hall: hallList){
            if(hall.getIdHall() == idHall){
                hall.setSeatQuantity(seatQuantity);
                hall.setColumnQuantity(columnQuantity);
                hall.setHallType(hallType);

            }
        }
    };

    public void deleteHall(int idHall){
        for(Hall hall: hallList){
            if(hall.getIdHall() == idHall){
                hallList.remove(hall);
            }
        }
    };

    public void countHall(){
        hallList.size();
    };

}
