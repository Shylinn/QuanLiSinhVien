
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thuan
 */
public class Util {
        public static String inputString(String message){
            System.out.println(message);
            Scanner sc =new Scanner(System.in);
            String result=sc.nextLine();
            do{
                System.out.println(message);
                result=sc.nextLine();
                
            }
            while(result==null);
            return result;
            
            
            
        }
        public static Float inputFloat(String message){
           String floatValue;
            Float result=null;
            do{
                  floatValue=Util.inputString(message);
                try {
              
               result=Float.valueOf(floatValue);
                    
                } catch (Exception e) {
                }
     
                
            }
            while(result==null);
            return result;

            
            
        
        }
        
    
    
}
