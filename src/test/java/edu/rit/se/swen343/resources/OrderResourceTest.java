package edu.rit.se.swen343.resources;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import edu.rit.se.swen343.api.OrderQuery;
import edu.rit.se.swen343.api.OrderRequest;
import edu.rit.se.swen343.api.OrderResponse;

public class OrderResourceTest {
    OrderResource resource;

    @Before
    public void setUp() {
        this.resource = new OrderResource();
    }

    @Test
    public void testBasicOrderRequest() {
        OrderRequest request = new OrderRequest("basic", 5);
        OrderResponse response = resource.createOrder(request);

        assertNull(response.getError());
        assertEquals(1, response.getOrderNumber());
    }

    @Test
    public void testUniqueOrderIds() {
        OrderRequest request = new OrderRequest("basic", 5);
        OrderResponse response1 = resource.createOrder(request);
        OrderResponse response2 = resource.createOrder(request);

        assertNull(response1.getError());
        assertEquals(1, response1.getOrderNumber());

        assertNull(response2.getError());
        assertEquals(2, response2.getOrderNumber());
    }

    @Test
    public void testGetOrders() {
        OrderQuery response = resource.getOrders();

        assertEquals(response.getActiveOrders(), 20);
    }
}
