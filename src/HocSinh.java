/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author thuan
 */
public class HocSinh {
    private String maSo;
    private String hoTen;
    private float dtb;

    public HocSinh() {
    }

    public HocSinh(String maSo, String hoTen, float dtb) {
        this.setMaSo(maSo);
        this.setHoTen(hoTen);
        this.setDtb(dtb);
    }

    public String getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDtb() {
        return dtb;
    }

    public final void setMaSo(String maSo) {
      if(maSo !=null &&!maSo.isBlank()){
          this.maSo=maSo;
      }
    }

    public final void setHoTen(String hoTen) {
        if(hoTen !=null &&!hoTen.isBlank()){
          this.hoTen=hoTen;
      }
    }

    public final void setDtb(float dtb) {
        if(dtb>=0&&dtb<=10){
            this.dtb=dtb;
        }
    }
    
    
    
}
