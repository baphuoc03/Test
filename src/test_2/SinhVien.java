/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_2;

/**
 *
 * @author baphuoc
 */
public class SinhVien {
    private String HoTen;
    private String NgoaiNgu;
    private double Cannang;

    public SinhVien() {
    }

    public SinhVien(String HoTen, String NgoaiNgu, double Cannang) {
        this.HoTen = HoTen;
        this.NgoaiNgu = NgoaiNgu;
        this.Cannang = Cannang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNgoaiNgu() {
        return NgoaiNgu;
    }

    public void setNgoaiNgu(String NgoaiNgu) {
        this.NgoaiNgu = NgoaiNgu;
    }

    public double getCannang() {
        return Cannang;
    }

    public void setCannang(double Cannang) {
        this.Cannang = Cannang;
    }
    
}
