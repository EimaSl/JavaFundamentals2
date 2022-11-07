import lesson10_1023.homeWorkKinematiks.KinematicsService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class KinematicsServiceTest {


    @Test
    void distanceCalculation(){
        var kinematicsService = new KinematicsService();
        assertEquals(600, kinematicsService.distanceCalc(20,30));
    }

    @Test
    void distanceCalculation1(){
        var kinematicsService = new KinematicsService();
        assertEquals(0, kinematicsService.distanceCalc(-20,30));
    }

    @Test
    void distanceCalculation2(){
        var kinematicsService = new KinematicsService();
        assertEquals(0, kinematicsService.distanceCalc(20,130));
    }



}
