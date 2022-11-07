import lesson10_1023.homeWorkTeslaBatteries.CalculationService;
import lesson10_1023.homeWorkTeslaBatteries.row.EssBattery;
import lesson10_1023.homeWorkTeslaBatteries.row.EssCell;
import lesson10_1023.homeWorkTeslaBatteries.row.EssModule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationServiceTest {
    @Test
    void test_numOfBatPerCell_whenQuantity1Expected7() {
        //given
        var calculationService = new CalculationService();
        //when
        EssCell essCell = new EssCell(1, 1, 1);
        //then
        assertEquals(7, calculationService.numberOfBatteriesPerCell(essCell));
    }

    @Test
    void test_numOfBatPerEss_whenQuantity1AndSetPerPack5Expected35() {
        //given
        var calculationService = new CalculationService();
        //when
        EssCell essCell = new EssCell(1, 1, 5);
        //then
        assertEquals(35, calculationService.numberOfBatteriesPerEssModule(essCell));
    }

    @Test
    void test_oneCellPower() {
        //given
        var calculationService = new CalculationService();
        //when
        EssBattery essBattery = new EssBattery("test", "test", 10000, 10);
        EssCell essCell = new EssCell(10, 500, 5);
        EssModule essModule = new EssModule(1);
        //then
        assertEquals(5, calculationService.oneCellPower(essBattery, essCell, essModule));
    }

    @Test
    void test_oneCellCapacity() {
        //given
        var calculationService = new CalculationService();
        //when
        EssBattery essBattery = new EssBattery("test", "test", 10000, 10);
        EssCell essCell = new EssCell(10, 500, 5);
        //then
        assertEquals(5000, calculationService.oneCellCapacity(essBattery,essCell));
    }
}
