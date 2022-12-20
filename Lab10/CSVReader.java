import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private List<String[]> rows = new ArrayList<>();
    private String fileName;
    private String separator;

    public CSVReader(String fileName, String separator) {
        this.fileName = fileName;
        this.separator = separator;
    }

    public List<String[]> read() throws NoColumnNameException, InvalidColumnCountException, NotACSVFileException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            int expectedColumnCount = -1;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                String[] cells = line.split(separator);
                if (lineNumber == 1) {

                    if (cells.length == 0 || cells[0].isEmpty()) {
                        throw new NoColumnNameException("No column names found in first line of file");
                    }
                    expectedColumnCount = cells.length;
                } else {

                    if (cells.length != expectedColumnCount) {
                        throw new InvalidColumnCountException("Line " + lineNumber + " has an invalid number of columns");
                    }
                }
                rows.add(cells);
            }

            if (!fileName.endsWith(".csv")) {
                throw new NotACSVFileException("File is not a CSV file (incorrect file extension)");
            }

            return rows;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        rows.forEach(row -> {
            sb.append(String.join(":", row));
            sb.append(System.lineSeparator());
        });
        return sb.toString();
    }

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("C:\\Users\\kamil\\Downloads\\test.csv", ",");
        try {
            System.out.println(csvReader.read());
            System.out.println(csvReader);
        } catch (NoColumnNameException | InvalidColumnCountException | NotACSVFileException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }

}