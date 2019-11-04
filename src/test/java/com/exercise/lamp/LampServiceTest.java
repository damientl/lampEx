package com.exercise.lamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LampServiceTest {

    private  LampService service = new LampService();

    @Test
    public void shouldLightFirstandThirdMoment(){
        int[] turnedOnLights = {1,3,2};
        int[] expected = {1,3};
        Assertions.assertEquals(expected, service.checkMomentsAllLigthsOn(turnedOnLights));
    }
}
