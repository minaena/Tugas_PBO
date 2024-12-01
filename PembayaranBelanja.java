/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI Modern
 */
public class PembayaranBelanja implements MetodeBayarPakeAplikasi {
    double kembalian;
    double sisa;
    double belanjaTotal;
    
    @Override
    public double BayarCash(double cash, double belanja){
        kembalian = cash - belanja;
        return kembalian;
    }
    
    @Override
    public double BayarQRIS(int idUser, double saldo, double belanjaTotal){
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    
    @Override
    public double BayarEwallet(int idUser, double saldo, double belanjaTotal){
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    
    @Override
    public double BayarKreditCard(int idUser, double saldo, double belanjaTotal){
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    
    public double BayardebitCard(int idUser, double saldo, double belanjaTotal){
        sisa = saldo - belanjaTotal;
        return sisa;
    }   

    @Override
    public double BayarGopay(int idUser, double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }

    public double BayarShoppy(int idUser, double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }

    public double BayarDebitCard(int idUser, double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }
}