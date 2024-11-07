package utilities;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelTestDataProvider {

    public static List<ExcelTestDataRow> getData() throws Exception{

        List<ExcelTestDataRow> testData = new ArrayList<>();
        try (Workbook workbook = WorkbookFactory.create(new FileInputStream(
                "D:\\University\\4th_year\\IS4102 - ASQA\\Assignment_2\\testData.xlsx"))) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                String priceFrom = row.getCell(0).toString();
                String priceTo = row.getCell(1).toString();
                testData.add(new ExcelTestDataRow(priceFrom, priceTo));
            }
        }

        return testData;

    }

}
