/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author thuan
 */
public class Demo1 {

    /**5
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            HocSinh hs1=new HocSinh();
            hs1.input();
            HocSinh hs2=new HocSinh();
            hs2.input();
            if(hs1.getDtb()>hs2.getDtb()){
                System.out.println("Học sinh 1 có điểm tb cao hơn");
            }
            else{
                 System.out.println("Học sinh 2 có điểm tb cao hơn");
            }
            
    }
    
}
