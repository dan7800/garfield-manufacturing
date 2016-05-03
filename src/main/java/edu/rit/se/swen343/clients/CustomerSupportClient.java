package edu.rit.se.swen343.clients;

import java.util.List;
import java.util.Map;

import edu.rit.se.swen343.api.Phone;

public interface CustomerSupportClient {
    public List<Phone> getPhonesFromTicket(String labelInformation) throws Exception;

    public void postPhonesReceieved(Map<String, Boolean> phoneRefundStatus) throws Exception;
}
