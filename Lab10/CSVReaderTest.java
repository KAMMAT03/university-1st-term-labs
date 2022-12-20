import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CSVReaderTest {

    @Test
    public void testReadNotACSVFile() {
        CSVReader csvReader = new CSVReader("C:\\Users\\kamil\\Downloads\\Zeszyt2.txt", ",");
        try {
            csvReader.read();
            fail("Exception should be thrown");
        } catch (NotACSVFileException e) {
            assertEquals("File is not a CSV file (incorrect file extension)", e.getMessage());
        } catch (NoColumnNameException | InvalidColumnCountException e) {
            fail("Wrong exception thrown");
        }
    }

    @Test
    public void testReadCorrectNumberOfRows() throws NoColumnNameException, InvalidColumnCountException, NotACSVFileException {
        CSVReader csvReader = new CSVReader("C:\\Users\\kamil\\Downloads\\Zeszyt1.csv", ",");
        List<String[]> rows = csvReader.read();
        assertEquals(5, rows.size());
    }

}