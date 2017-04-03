import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Sim0o on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        List<Field> fields = Arrays.asList(Reflection.class.getDeclaredFields());
        fields.sort(new Comparator<Field>() {
            @Override
            public int compare(Field o1, Field o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Field fld:fields) {
            if (!Modifier.isPrivate(fld.getModifiers())) {
                System.out.printf("%s must be private!\n", fld.getName());
            }
        }


        List<Method> methods = Arrays.asList(Reflection.class.getDeclaredMethods());
        for(Method mtd:methods){
            if(mtd.getName().startsWith("get")){
                if(mtd.getParameterCount()==0){
                    if(!Modifier.isPublic(mtd.getModifiers())){
                        System.out.printf("%s have to be public!\n", mtd.getName());
                    }
                }
            }
        }

        for(Method mtd:methods){
            if(mtd.getName().startsWith("set")){
                if(mtd.getParameterCount()==0){
                    if(!Modifier.isPrivate(mtd.getModifiers())){
                        System.out.printf("%s have to be private!\n", mtd.getName());
                    }
                }
            }
        }
    }
}
