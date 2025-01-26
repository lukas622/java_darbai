package solid.srp.incorrect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextTransformer {

    public String transform(TransformType transformType, String text) {

        return transformType.apply(text);
    }

    public void processUi() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;

            System.out.print("$ ");

            while ((input = reader.readLine()) != null) {
                int colonIdx = input.indexOf(':');
                TransformType transformType = TransformType.valueOf(input.substring(0, colonIdx));
                String text = input.substring(colonIdx + 1);

                String transformed = transform(transformType, text);
                System.out.println("Transformed:" + transformed);

                System.out.print("$ ");
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to present user interface", e);
        }
    }
}
