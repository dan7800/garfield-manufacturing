package edu.rit.se.swen343.clients;

public class MockInventoryAPIClient implements InventoryAPIClient {

    @Override
    public int getBaseProcessors() {
        return 0;
    }

    @Override
    public int getKeyboards() {
        return 0;
    }

    @Override
    public int getTouchScreens() {
        return 0;
    }

    @Override
    public int getFastProcessors() {
        return 0;
    }

    @Override
    public int get16GBMemory() {
        return 0;
    }

    @Override
    public int get32GBMemory() {
        return 0;
    }

    @Override
    public int get64GBMemory() {
        return 0;
    }

    @Override
    public int get128GBMemory() {
        return 0;
    }

    @Override
    public boolean decrementKeyboards() {
        return true;
    }

    @Override
    public boolean decrementTouchScreens() {
        return true;
    }

    @Override
    public boolean decrementBaseProcessors() {
        return true;
    }

    @Override
    public boolean decrementFastProcessors() {
        return true;
    }

    @Override
    public boolean decrement16GBMemory() {
        return true;
    }

    @Override
    public boolean decrement32GBMemory() {
        return true;
    }

    @Override
    public boolean decrement64GBMemory() {
        return true;
    }

    @Override
    public boolean decrement128GBMemory() {
        return true;
    }

}
