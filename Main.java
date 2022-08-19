/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sk.slovicka;

/**
 *
 * @author Edo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Test slovicok z IT oblasti ");        
        System.out.println("Odpovede napis bez diakritiky ");
        System.out.println("Mozes napisat aj viac spravnych odpovedi, oddelovac slov pouzi medzeru ");
        System.out.println("Vela stastia! ");

        System.out.println("----------------------------------");



        
        AnglickeSlovicka anglickeSlovicka = new AnglickeSlovicka();
        anglickeSlovicka.skusajSlovoAccess();
        anglickeSlovicka.skusajSlovoRelease();
        anglickeSlovicka.skusajSlovoLayer();
        anglickeSlovicka.skusajSlovoBorder("oramovanie");
        anglickeSlovicka.skusajSlovoColumn("stlpec");
        anglickeSlovicka.skusajSlovoCommon();
        anglickeSlovicka.skusajSlovoCondition();
        anglickeSlovicka.skusajSlovoDependent();
        anglickeSlovicka.skusajSlovoDeployment();
        anglickeSlovicka.skusajSlovoExpression();
        anglickeSlovicka.skusajSlovoFiber();
        anglickeSlovicka.vyhodnocujTest();

    }

    

}
