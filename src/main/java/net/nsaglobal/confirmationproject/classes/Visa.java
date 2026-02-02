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

    @Getter
    @Setter
    private ArrayList<HashMap<String, String>> flightsData;

//Constructor

    public Visa() {
        status = Status.UNSEARCHABLE;
        this.flightsData = new ArrayList<HashMap<String, String>>();
    }

//Methods

//    public ArrayList<HashMap<String, String>> returnFlightsData(String line) {
//        defineSearchCapabilityPickUp(line);
//        if(this.status == Status.SEARCHABLE) {
//
//        }
//    }

//Private Methods

    private void defineSearchCapabilityPickUp(String line) {
        if(line.equals(this.lineBeforePickUp)) {
            this.status = Status.SEARCHABLE;
        } else if (line.startsWith("Executive:")) {
            this.status = Status.UNSEARCHABLE;
        }
    }
}
