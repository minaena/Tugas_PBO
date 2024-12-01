/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI Modern
 */
public class MainClass extends PembayaranBelanja {
    public static void main(String [] args){
    PembayaranBelanja pb = new PembayaranBelanja();
    pb.BayarCash(200000, 175000);
    System.out.println(pb.kembalian);
    pb.BayarQRIS(111, 55000, 23000);
    System.out.println(pb.kembalian);
    pb.BayarEwallet(222, 77000, 36000);
    System.out.println(pb.sisa);
    pb.BayarKreditCard(333, 125000, 46000);
    System.out.println(pb.sisa);
    pb.BayarShoppy(444, 65000, 4500);
    System.out.println(pb.sisa);
    }
}