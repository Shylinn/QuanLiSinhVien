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
    public void input(){
        this.setMaSo(Util.inputString("Bạn hãy nhập mã số"));
        this.setHoTen(Util.inputString("Bạn hãy nhập họ tên"));
        this.setDtb(Util.inputFloat("Bạn hãy nhập điểm tb"));
       
    }
    public void output(){
        System.out.println(this.toString());
    }
    public String rank(){
        String result;
        if(dtb<5.5){
            result="Yếu";
        }
        else if(dtb<6.5){
            result="Trung bình";
        }
        else if(dtb<8.5){
        result="Khá";
               
       }else{
            result="Giỏi";
        }
        return result;
    
    }
    public void changName(){

        setHoTen(Util.inputString("Bạn hãy nhập tên cần chỉnh"));
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HocSinh{");
        sb.append("maSo=").append(maSo);
        sb.append(", hoTen=").append(hoTen);
        sb.append(", dtb=").append(dtb);
        sb.append(", dtb=").append(this.rank());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
