package edu.rit.se.swen343.resources;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.rit.se.swen343.api.OrderQuery;
import edu.rit.se.swen343.api.OrderRequest;
import edu.rit.se.swen343.api.OrderResponse;
import edu.rit.se.swen343.api.Phone;

public class OrderResourceTest {
    OrderResource resource;

    @Before
    public void setUp() {
        this.resource = new OrderResource();
    }

    @Test
    public void testBasicOrderRequest() throws Exception {
        OrderRequest request = new OrderRequest("BASIC", 5);
        OrderResponse response = resource.createOrder(request);

        //@formatter:off
        List<Phone> expectedPhones = Arrays.asList(
                new Phone("B00000001"),
                new Phone("B00000002"),
                new Phone("B00000003"),
                new Phone("B00000004"),
                new Phone("B00000005"));
        //@formatter:on

        assertNull(response.getError());
        assertEquals(1, response.getOrderNumber());
        assertEquals(expectedPhones, response.getPhonesCreated());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalAmount() throws Exception {
        OrderRequest request = new OrderRequest("BASIC", -5);
        resource.createOrder(request);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalTypeName() throws Exception {
        OrderRequest request = new OrderRequest("ILLEGAL", 5);
        resource.createOrder(request);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullTypeName() throws Exception {
        OrderRequest request = new OrderRequest(null, 5);
        resource.createOrder(request);
    }

    @Test
    public void testUniqueOrderIds() throws Exception {
        OrderRequest request = new OrderRequest("BASIC", 5);
        OrderResponse response1 = resource.createOrder(request);
        OrderResponse response2 = resource.createOrder(request);

        // @formatter:off
        List<Phone> expectedPhones1 = Arrays.asList(
                new Phone("B00000001"),
                new Phone("B00000002"),
                new Phone("B00000003"),
                new Phone("B00000004"),
                new Phone("B00000005"));
        // @formatter:on

        // @formatter:off
        List<Phone> expectedPhones2 = Arrays.asList(
                new Phone("B00000006"),
                new Phone("B00000007"),
                new Phone("B00000008"),
                new Phone("B00000009"),
                new Phone("B00000010"));
        // @formatter:on

        assertNull(response1.getError());
        assertEquals(1, response1.getOrderNumber());
        assertEquals(expectedPhones1, response1.getPhonesCreated());

        assertNull(response2.getError());
        assertEquals(2, response2.getOrderNumber());
        assertEquals(expectedPhones2, response2.getPhonesCreated());
    }

    @Test
    public void testGetOrders() {
        OrderQuery response = resource.getOrders();

        assertEquals(response.getActiveOrders(), 20);
    }
}
