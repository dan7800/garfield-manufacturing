package edu.rit.se.swen343.resources;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.ws.rs.WebApplicationException;

import org.junit.Before;
import org.junit.Test;

import edu.rit.se.swen343.api.Order;
import edu.rit.se.swen343.api.Order.ModelType;
import edu.rit.se.swen343.api.OrderRequest;

public class OrderResourceTest {

    private OrderResource resource;

    @Before
    public void setUp() {
        resource = new OrderResource();
    }

    @Test
    public void testGetAll() {
        List<Order> orders = resource.getOrders();

        // currently, it returns hard coded values
        assertEquals(orders.get(0), new Order(1, ModelType.BASIC));
        assertEquals(orders.get(1), new Order(2, ModelType.HIGHEND));
    }

    @Test
    public void testGet() {
        Order order = resource.getOrder(22);

        assertEquals(order.getId(), 22);
        assertEquals(order.getModel(), ModelType.BASIC);
    }

    @Test(expected = WebApplicationException.class)
    public void testGetNotFound() {
        resource.getOrder(404);
    }

    @Test
    public void createOrder() {
        OrderRequest toCreate = new OrderRequest();
        toCreate.setModel("HIGHEND");

        Order created = resource.createOrder(toCreate);

        assertEquals(created.getId(), 1);
        assertEquals(created.getModel(), ModelType.HIGHEND);
    }

    @Test
    public void createOrderMultipleRequests() {
        OrderRequest toCreate = new OrderRequest();
        toCreate.setModel("HIGHEND");

        Order created1 = resource.createOrder(toCreate);

        assertEquals(created1.getId(), 1);
        assertEquals(created1.getModel(), ModelType.HIGHEND);

        Order created2 = resource.createOrder(toCreate);

        assertEquals(created2.getId(), 2);
        assertEquals(created2.getModel(), ModelType.HIGHEND);
    }
}
