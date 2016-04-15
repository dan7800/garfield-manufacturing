package edu.rit.se.swen343.clients;

import java.util.List;
import java.util.Map;

import edu.rit.se.swen343.api.Phone;

public class MockCustomerSupportClient implements CustomerSupportClient {

    @Override
    public List<Phone> getPhonesFromTicket(String labelInformation) {
        return null;
    }

    @Override
    public void postPhonesReceieved(Map<String, Boolean> phoneRefundStatus) {
    }

}
