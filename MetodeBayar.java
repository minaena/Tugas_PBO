/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MSI Modern
 */
public interface MetodeBayar {
    public double BayarCash(double cash, double belanja);
    public double BayarQRIS(int idUser, double saldo, double belanjaTotal);
    public double BayarEwallet(int idUser, double saldo, double belanjaTotal);
    public double BayarKreditCard(int idUser, double saldo, double belanjaTotal);
    public double BayarDebitCard(int idUser, double saldo, double belanjaTotal);
}