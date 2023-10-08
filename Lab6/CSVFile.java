import java.util.ArrayList;
import java.util.List;
public class CSVFile {
    /**
     * The list of rows read from a file. Each row consists
     * of a table of String values representing the actual
     * value from CSV.
     */
    private List<String[]> rows = new ArrayList<>();
/**
 * Reads given file as CSV with given separator
 * @param fileName the name of the CSV file to read.
 * @param separator the separator used in CSV file.
 */
public CSVFile(String fileName, String separator) {
// Write your code here
}
    /**
     * Writes the CSV data into the file.
     * @param fileName of a file to write.
     * @param separator to be used in written CSV.
     */
    public void writeCSVFile(String fileName, String separator) {
// Write your code here
    }
    @Override
    public String toString() {
// Write your code here
        return null;
    }
    public static void main(String[] args) {
        System.out.println(new CSVFile("plik.csv", ","));
    }
}
