package lesson10_1023.homeWorkTeslaBatteries;

import lesson10_1023.homeWorkTeslaBatteries.row.EssBattery;
import lesson10_1023.homeWorkTeslaBatteries.row.EssCell;
import lesson10_1023.homeWorkTeslaBatteries.row.EssModule;
import lesson10_1023.homeWorkTeslaBatteries.row.GeneratePDF;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, FileNotFoundException {

        // calculate total batteries power +
        // Tesla batteries types 8650 + { read file for other options like: 21700 4680}
        // create pdf outcome +
        // JUnit +

        EssBattery batteries = new EssBattery("Panasonic", "NCR18650B", 8650, 49);
        EssCell essCell1 = new EssCell(8,25.4, 8);
        EssModule essModule = new EssModule(400);

        CalculationService calculationService = new CalculationService();

        System.out.println("\t\tTESLA BATTERY TECHNICAL CALCULATOR");
        System.out.println("Capacity of one cell: \t\t\t\t\t" + (calculationService.oneCellCapacity(batteries, essCell1)) + " A");
        System.out.println("Power of one cell: \t\t\t\t\t\t" + (calculationService.oneCellPower(batteries, essCell1, essModule)) + " kWh");
        System.out.println("Number of batteries per cell: \t\t\t" + (calculationService.numberOfBatteriesPerCell(essCell1)) + " units");
        System.out.println("Number of batteries per Ess Module: \t" + (calculationService.numberOfBatteriesPerEssModule(essCell1)) + " units");

        GeneratePDF generatePDF = new GeneratePDF();
        generatePDF.generateSummary(essModule,essCell1,batteries);

    }
}
