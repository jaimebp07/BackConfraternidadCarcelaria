package org.confraternidadcarcelaria;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TicketResource {

    private static List<Ticket> tickets = new ArrayList<>();

    static {
        tickets.add(new Ticket(1, "John", "Doe", "1234567890", true));
        tickets.add(new Ticket(2, "Jane", "Smith", "9876543210", false));
        // Agrega más boletos aquí si es necesario
    }

    @GET
    public List<Ticket> list() {
        return tickets;
    }

    @POST
    public void add(Ticket ticket) {
        tickets.add(ticket);
    }

    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        // Implementa la lógica para eliminar el boleto por ID aquí
    }
}