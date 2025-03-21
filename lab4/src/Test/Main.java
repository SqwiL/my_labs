package Test;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            A a = new A();
            for (Field field: a.getClass().getDeclaredFields()){
                field.setAccessible(true);
                if (field.getType() == int.class && (int)field.get(a) < 1 && field.getModifiers() == 2){
                    field.set(a,4);
                }
            }
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
