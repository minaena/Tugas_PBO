/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI Modern
 */
public interface MetodeBayarPakeAplikasi extends MetodeBayar{
    public double BayarGopay(int idUser, double saldo, double belanjaTotal);
    public double BayarShoppy(int idUser, double saldo, double belanjaTotal);
    
    @Override
    public double BayarDebitCard(int idUser, double saldo, double belanjaTotal);
    
    @Override
    public double BayarKreditCard(int idUser, double saldo, double belanjaTotal);
    
}