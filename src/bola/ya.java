/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ya {
        static Scanner sc = new Scanner(System.in);

    public double jarijari;

    public void setJarijari(){
        System.out.println("Tentukan jari jari: ");
        jarijari = sc.nextDouble();
    }

    public void ShowDiameter(){
        double diameter = jarijari * 2;
        System.out.println("Diameter bola: "+diameter);
    }

    public void ShowLuasPermukaan(){
        double lp = (4 * (3.14) * (jarijari * jarijari));
        System.out.println("Rumus Luas Permukaan: (4 * (3.14) * (jarijari * jarijari))");
        System.out.println("Luas permukaan: "+lp);
    }

    public void ShowVolume(){
        double volume = ((4 / 3) * (3.14) * (jarijari * jarijari * jarijari));
        System.out.println("Rumus Volume: ((4 / 3) * (3.14) * (jarijari * jarijari * jarijari))");
        System.out.println("Volume: "+volume);
}
}  