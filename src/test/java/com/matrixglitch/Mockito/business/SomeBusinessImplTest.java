package com.matrixglitch.Mockito.business;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SomeBusinessImplTest {
    @Test
    void FindGreatestFromAllData(){
        DataServiceStub dataServiceStub = new DataServiceStub();
        SomeBusinessImpl business = new SomeBusinessImpl(dataServiceStub);
        assertEquals(25,business.findTheGreatestFromAllData());
    }

}

class DataServiceStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{25,11,20};
    }
}