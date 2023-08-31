package org.confraternidadcarcelaria;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/tickets")
public class Ticket {

    private int idTicket;
    private String nameContestant;
    private String lastnameContestant;
    private String phoneContestant;
    private boolean stateTicket;

    public Ticket(){
    }

    public Ticket(int idTicket, String nameContestant, String lastnameContestant, String phoneContestant, boolean stateTicket) {
        this.idTicket = idTicket;
        this.nameContestant = nameContestant;
        this.lastnameContestant = lastnameContestant;
        this.phoneContestant = phoneContestant;
        this.stateTicket = stateTicket;
    }

  
}