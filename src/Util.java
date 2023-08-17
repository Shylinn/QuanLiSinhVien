
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
//            System.out.println(message);

            Scanner sc =new Scanner(System.in);
            String result;
            do{
                System.out.println(message);
                result=sc.nextLine();
                
            }
            while(result==null);
            return result;
            
            
            
        }
        
        public static Float inputFloat(String message){
            String str;
            Float result=null;
            do{
                str=Util.inputString(message);
                try {
                    result=Float.valueOf(str);
                } catch (Exception e) {
                }
            }
            while(result==null);
            return result;
            

            }
            
            
      
        
    
    
}
