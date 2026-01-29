package net.nsaglobal.confirmationproject.classes;

import lombok.Setter;
import net.nsaglobal.confirmationproject.enums.Status;
import lombok.Getter;
import java.util.ArrayList;
import java.util.HashMap;



public class Visa {

//Attributes & Getters and Setters

    @Getter
    private final String name = "Visa";

    @Getter
    private final String lineBeforePickUp = "Pick-up Date Flight# Airport Time";

    @Getter
    private final String lineBeforeDeparture = "Drop-off Date Flight# Airport Time";

    @Getter
    @Setter
    private Status status;

//Constructor

    public Visa() {
        status = Status.SEARCHABLE;
    }

//Methods

//    public ArrayList<HashMap<String, String>> returnFlightsData(String line) {
//       if(line.equals(this.lineBeforeDeparture)) {
//    }
//            markAsSearchable();
//
//        }
//    }

//Private Methods

    private void markAsSearchable() {
        this.status = Status.SEARCHABLE;
    }

    private void markAsUnsearchable() {
        this.status = Status.UNSEARCHABLE;
    }
}
