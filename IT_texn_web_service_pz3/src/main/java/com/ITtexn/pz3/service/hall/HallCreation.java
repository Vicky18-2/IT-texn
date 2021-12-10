package com.ITtexn.pz3.service.hall;

import com.ITtexn.pz3.service.film.Film;

import java.util.ArrayList;
import java.util.List;

public class HallCreation extends Hall {

    private List<Hall> hallList;

    public HallCreation() {
        hallList = new ArrayList<>();
        hallList.add(new Hall(1,"3D",2,3));
    }


    public List<Hall> getAllHalls() {
        return hallList;
    }

    public Hall getHall(int idHall) {
        for (Hall hall : hallList) {
            if (hall.getIdHall() == idHall) {
                return hall;
            }
        }

        return null;
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
        int index = hallList.lastIndexOf(getHall(idHall));
        hallList.remove(index);
    };

    public int countHall(){
        return hallList.size();
    };

}
