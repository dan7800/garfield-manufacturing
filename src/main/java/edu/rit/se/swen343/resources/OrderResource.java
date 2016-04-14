package edu.rit.se.swen343.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import edu.rit.se.swen343.api.OrderQuery;
import edu.rit.se.swen343.api.OrderRequest;
import edu.rit.se.swen343.api.OrderResponse;
import edu.rit.se.swen343.api.Phone;
import edu.rit.se.swen343.clients.InventoryAPIClient;
import edu.rit.se.swen343.clients.MockInventoryAPIClient;

@Path("/orders")
public class OrderResource {

    private int currentOrder;
    private int serialNumber;

    public OrderResource() {
        this.currentOrder = 1;
        this.serialNumber = 1;
    }

    @POST
    @Path("/create")
    public OrderResponse createOrder(OrderRequest request) {
        InventoryAPIClient client = new MockInventoryAPIClient();

        // in the future, this will do actual work
        client.decrementFastProcessors(); // pull a fast processor off the rack

        List<Phone> phonesCreated = new ArrayList<>();
        for (int i = 0; i < request.getAmount(); i++) {
            phonesCreated.add(new Phone(String.format("%s%08d",
                    request.getType(), this.serialNumber++)));
        }

        // @formatter:off
        return OrderResponse.builder()
                .orderNumber(this.currentOrder++)
                .phonesCreated(phonesCreated)
                .error(null)
                .build();
        // @formatter:on
    }

    @GET
    public OrderQuery getOrders() {
        return new OrderQuery(20); // eventually this can actaully contain
                                   // orders
    }
}
