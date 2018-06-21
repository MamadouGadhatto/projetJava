/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilissateur;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Utilissateur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList chiffreTab = new ArrayList();
        for (int i = 0; i <= 10; i++) {

            System.out.println("Veuillez saisir le chiffre "+i);
            int result = sc.nextInt();
            chiffreTab.add(result);

        }
        System.out.println(chiffreTab);
    }
}
