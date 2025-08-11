package pkg_wrraper_class;

public class BooleanExample {

    public static void main(String[] args) {
        String str = "trUe";

 
        boolean parsedBoolean = Boolean.parseBoolean(str); 


        Boolean valueOfBoolean = Boolean.valueOf(str);

        boolean isBooleanValue = valueOfBoolean.booleanValue();
        
        
        
        System.out.println("parseBoolean: " + parsedBoolean);
        System.out.println("valueOf: " + valueOfBoolean);
        System.out.println("getBoolean: " + isBooleanValue);
        
//        int val = Integer.parseInt("abc");
//        System.out.println("val"+val);
//        
//        Integer i = Integer.valueOf("abkc");
//        System.out.println("i"+i);
        
        Integer i = Integer.compare(3, 5);
        System.out.println("i"+i);

        
    }
}
