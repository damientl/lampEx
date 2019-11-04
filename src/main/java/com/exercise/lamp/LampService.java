package com.exercise.lamp;

public class LampService {
    public int[] checkMomentsAllLigthsOn(int[] turnedOnLights) {

        int lights = 0;
        int[] moments = new int[turnedOnLights.length];
        int k=0;
        for ( int i=0; i<turnedOnLights.length; i++){
            lights = setIndexPositionToOne(lights, turnedOnLights[i] - 1);
            if(areAllBitsSet(lights)){
                moments[k] = i+1;
                k++;
            }
        }
        int[] result = new int[k];

        System.arraycopy(moments, 0, result,0, k);
        return result;
    }

    private int setIndexPositionToOne(int lights, int turnedOnLight) {
        if(turnedOnLight < 0){
            throw new IllegalArgumentException("Light numbers must be > 1");
        }

        return lights + (int) Math.pow(2D, (double) turnedOnLight);
    }

    private Boolean areAllBitsSet(int n)
    {
        if (n == 0)
            return false;

        while (n > 0)
        {
            if ((n & 1) == 0)
                return false;

            n = n >> 1;
        }
        return true;
    }
}
