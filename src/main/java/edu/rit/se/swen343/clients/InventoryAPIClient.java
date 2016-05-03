package edu.rit.se.swen343.clients;

public interface InventoryAPIClient {
    // getters
    public int getKeyboards() throws Exception;

    public int getTouchScreens() throws Exception;

    public int getBaseProcessors() throws Exception;

    public int getFastProcessors() throws Exception;

    public int get16GBMemory() throws Exception;

    public int get32GBMemory() throws Exception;

    public int get64GBMemory() throws Exception;

    public int get128GBMemory() throws Exception;

    // decrementors
    public boolean decrementKeyboards() throws Exception;

    public boolean decrementTouchScreens() throws Exception;

    public boolean decrementBaseProcessors() throws Exception;

    public boolean decrementFastProcessors() throws Exception;

    public boolean decrement16GBMemory() throws Exception;

    public boolean decrement32GBMemory() throws Exception;

    public boolean decrement64GBMemory() throws Exception;

    public boolean decrement128GBMemory() throws Exception;
}
