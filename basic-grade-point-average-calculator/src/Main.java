/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
import java.util.Scanner;

public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fizik notunuzu girin:");
        int fizikNotu = scanner.nextInt();
        
           System.out.println("Matematik notunuzu girin:");
        int matematikNotu = scanner.nextInt();
        
        System.out.println("Kimya notunuzu girin:");
        int kimyaNotu = scanner.nextInt();
        
                
        System.out.println("Türkçe notunuzu girin:");
        int türkceNotu = scanner.nextInt();
        
                
        System.out.println("Tarih notunuzu girin:");
        int tarihNotu = scanner.nextInt();
        
                
        System.out.println("Müzik notunuzu girin:");
        int muzikNotu = scanner.nextInt();
        
        double ort  =  (fizikNotu +  matematikNotu + kimyaNotu + türkceNotu + tarihNotu + muzikNotu)/6.0;
        
        System.out.println(  ort>45 ? "Geçti" : "Kaldı");
    }
}