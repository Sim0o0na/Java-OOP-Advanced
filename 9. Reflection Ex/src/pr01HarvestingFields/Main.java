package pr01HarvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, List<Field>> fields = new HashMap<>();

		Field[] rsl = RichSoilLand.class.getDeclaredFields();

		fields.put("private",Arrays.stream(rsl).filter(e->Modifier.isPrivate(e.getModifiers())).collect(Collectors.toList()));
		fields.put("protected",Arrays.stream(rsl).filter(e->Modifier.isProtected(e.getModifiers())).collect(Collectors.toList()));
		fields.put("public",Arrays.stream(rsl).filter(e->Modifier.isPublic(e.getModifiers())).collect(Collectors.toList()));

		String debug = "";
		String cmd = reader.readLine();
		boolean isTrue = true;
		while(isTrue) {
			switch (cmd) {
				case "private":
					fields.get("private").forEach(field -> {
						System.out.printf("%s %s %s\n", Modifier.toString(field.getModifiers()),field.getType().getSimpleName(), field.getName());
					});
					break;
				case "protected":
					fields.get("protected").forEach(field -> {
						System.out.printf("%s %s %s\n",Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
					});
					break;
				case "public":
					fields.get("public").forEach(field -> {
						System.out.printf("%s %s %s\n", Modifier.toString(field.getModifiers()), field.getType().getSimpleName(), field.getName());
					});
					break;
				case "all":
					Arrays.stream(rsl).forEach(value -> {
						System.out.printf("%s %s %s\n", Modifier.toString(value.getModifiers()), value.getType().getSimpleName(), value.getName());
					});
					break;
				case "HARVEST":
					isTrue = false;
					break;
			}
			cmd = reader.readLine();
		}
	}
}
