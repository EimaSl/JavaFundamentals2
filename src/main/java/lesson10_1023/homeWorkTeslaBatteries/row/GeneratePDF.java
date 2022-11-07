package lesson10_1023.homeWorkTeslaBatteries.row;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.DashedBorder;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import lesson10_1023.homeWorkTeslaBatteries.CalculationService;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class GeneratePDF {

    public void generateSummary(EssModule essModule, EssCell essCell, EssBattery essBattery) throws FileNotFoundException, MalformedURLException {

        CalculationService calculationService = new CalculationService();

        String path = "tesla.pdf";
        PdfWriter pdfWriter = new PdfWriter(path);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);

        Document document = new Document(pdfDocument);
        //watermark logo
        String imagePath = "src/main/resources/teslaBatInside.jpg";
        ImageData imageData = ImageDataFactory.create(imagePath);
        Image image = new Image(imageData);

        float x = pdfDocument.getDefaultPageSize().getWidth() / 2;
        float y = pdfDocument.getDefaultPageSize().getHeight() / 2;
        image.setFixedPosition(x -150, y-100 );
        image.setOpacity(2f);
        document.add(image);
        float threecol = 190f;
        float twocol = 285f;
        float twocol150 = twocol + 150f;
        float twocolumnWidth[] = {twocol150, twocol};

        float fullwidth[] = {threecol * 3};
        Paragraph onespace = new Paragraph("\n");

        Table table = new Table(twocolumnWidth);

        table.addCell(new Cell().add("TESLA ").setFontSize(20f).setBorder(Border.NO_BORDER).setBold());

        Table nestedTable = new Table(new float[]{twocol / 2, twocol / 2});

        nestedTable.addCell(getHeaderTextCell("Homework No.: "));
        nestedTable.addCell(getHeaderTextCellValue("Kodo Kelias"));
        nestedTable.addCell(getHeaderTextCell("Performed date: "));
        nestedTable.addCell(getHeaderTextCellValue("04/11/2022"));

        table.addCell(new Cell().add(nestedTable).setBorder(Border.NO_BORDER));

        //line
        Border greyBorder = new SolidBorder(Color.GRAY, 2f);
        Table divider = new Table(fullwidth);
        divider.setBorder(greyBorder);

        document.add(divider);
        document.add(table);
        document.add(onespace);

        float oneColumnWidth[] = {twocol150};

        Table oneColTable1 = new Table(oneColumnWidth);
        oneColTable1.addCell(getCell10fLeft("Name", true));
        oneColTable1.addCell(getCell10fLeft("Vit Kurt , Vilnius", false));
        document.add(oneColTable1.setMargin(10f));

        //dotted line
        Table tableDivider2 = new Table(fullwidth);
        Border dgd = new DashedBorder(Color.GRAY, 0.5f);
        document.add(tableDivider2.setBorder(dgd));

        Table tb = new Table(fullwidth);
        tb.addCell(new Cell().add("Calculation to find technical data of Tesla battery\n").setBold().setBorder(Border.NO_BORDER));
        List<String> list = new ArrayList<>();
        list.add("\t\t TESLA BATTERY TECHNICAL CALCULATOR");
        list.add("_______________________________________________");
        //dotted line

        list.add("1. Capacity of cell     :\t" + (calculationService.oneCellCapacity(essBattery,essCell)) + " Ampers.");
        list.add("2. Power of one cell  :\t" + (calculationService.oneCellPower(essBattery, essCell, essModule)) + " kWh.");
        list.add("3. Batteries per cell   :\t" + (calculationService.numberOfBatteriesPerCell(essCell)) + " QTY.");
        list.add("4. Batteries per Ess  :\t" + (calculationService.numberOfBatteriesPerEssModule(essCell)) + " QTY.");

        for (String s : list) {
            tb.addCell(new Cell().add(s).setBorder(Border.NO_BORDER));
        }
        document.add(tb);
        Table tableDivider3 = new Table(fullwidth);
        Border dgd1 = new DashedBorder(Color.BLACK, 0.5f);
        document.add(tableDivider3.setBorder(dgd1));
        document.close();
    }

    static Cell getHeaderTextCell(String textValue) {
        return new Cell().add(textValue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT);
    }

    static Cell getHeaderTextCellValue(String textValue) {
        return new Cell().add(textValue).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.RIGHT);
    }

    static Cell getBillingShippingCell(String textValue) {
        return new Cell().add(textValue).setFontSize(12f).setBold().setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
    }

    static Cell getCell10fLeft(String textValue, Boolean isBold) {
        Cell myCell = new Cell().add(textValue).setFontSize(10f).setBorder(Border.NO_BORDER).setTextAlignment(TextAlignment.LEFT);
        return isBold ? myCell.setBold() : myCell;
    }
}
