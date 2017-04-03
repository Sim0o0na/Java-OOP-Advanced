package custom_enum_annotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;

/**
 * Created by Sim0o on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String claz = reader.readLine();
        Annotation anno = null;
        switch (claz.toLowerCase()){
            case "rank":
                anno = Ranks.class.getAnnotation(CustomAnnotation.class);
            case "suit":
                anno = Suits.class.getAnnotation(CustomAnnotation.class);
        }

//        System.out.printf("Type = %s, Description =", anno.getClass().getFields());
    }
}
