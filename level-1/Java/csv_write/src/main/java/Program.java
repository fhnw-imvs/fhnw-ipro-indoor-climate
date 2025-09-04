// License https://creativecommons.org/publicdomain/zero/1.0
// based on $REPO_PATH/prompts/2025-08-29T09-45-00Z.txt

import java.io.FileWriter;
import java.io.IOException;

public final class Program {
    public static void main(String[] args) {
        String[][] data = {
            {"City", "ZIP Code"},
            {"Bern", "3000"},
            {"Basel", "4000"},
            {"Zürich", "8000"}
        };

        try (FileWriter w = new FileWriter("data.csv")) {
            for (String[] row : data) {
                String line = String.join(",", row);
                w.append(line);
                w.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
