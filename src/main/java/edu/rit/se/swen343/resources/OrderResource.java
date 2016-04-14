package edu.rit.se.swen343.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import edu.rit.se.swen343.api.OrderQuery;
import edu.rit.se.swen343.api.OrderRequest;
import edu.rit.se.swen343.api.OrderResponse;
import edu.rit.se.swen343.clients.InventoryAPIClient;
import edu.rit.se.swen343.clients.MockInventoryAPIClient;

@Path("/orders")
public class OrderResource {

    private int currentOrder;

    public OrderResource() {
        this.currentOrder = 1;
    }

    @POST
    @Path("/create")
    public OrderResponse createOrder(OrderRequest request) {
        InventoryAPIClient client = new MockInventoryAPIClient();

        // in the future, this will do actual work
        client.decrementFastProcessors(); // pull a fast processor off the rack

        // @formatter:off
        return OrderResponse.builder()
                .orderNumber(this.currentOrder++)
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
