package edu.rit.se.swen343.clients;

public interface InventoryAPIClient {
    // getters
    public int getKeyboards();

    public int getTouchScreens();

    public int getBaseProcessors();

    public int getFastProcessors();

    public int get16GBMemory();

    public int get32GBMemory();

    public int get64GBMemory();

    public int get128GBMemory();

    // decrementors
    public boolean decrementKeyboards();

    public boolean decrementTouchScreens();

    public boolean decrementBaseProcessors();

    public boolean decrementFastProcessors();

    public boolean decrement16GBMemory();

    public boolean decrement32GBMemory();

    public boolean decrement64GBMemory();

    public boolean decrement128GBMemory();
}
