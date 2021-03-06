import java.util.Scanner;

public class PeriodicTable {

    public static void main(String[] args) {
        int anum = 0; //atomic number
        System.out.println("Welcome to the Valence Electrons Calculator. "
                + "Please write the symbol of the element you want to find "
                + "the number of valence electron for: ");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        String element; //name of the element chosen
        if(choice.equals("H")){
            anum = 1;
            element = "Hydrogen";
        }else{
            element = "The unknown element"; //choses this if it is not Hydrogen, all other elements can cancel it out
        }
        if(choice.equals("He")){
            anum = 2;
            element = "Helium";
        }
        if(choice.equals("Li")){
            anumber = 3;
            element = "Lithium";
        }
        if(choice.equals("Be")){
            anum = 4;
            element = "Beryllium";
        }
        if(choice.equals("B")){
            anum = 5;
            element = "Boron";
        }
        if(choice.equals("C")){
            anum = 6;
            element = "Carbon";
        }
        if(choice.equals("N")){
            anum = 7;
            element = "Nitrogen";
        }
        if(choice.equals("O")){
            anum = 8;
            element = "Oxygen";
        }
        if(choice.equals("F")){
            anum = 9;
            element = "Fluoride";
        }
        if(choice.equals("Ne")){
            anum = 10;
            element = "Neon";
        }
        if(choice.equals("Na")){
            anum = 11;
            element = "Sodium";
        }
        if(choice.equals("Mg")){
            anum = 12;
            element = "Magnesium";
        }
        if(choice.equals("Al")){
            anum = 13;
            element = "Aluminium";
        }
        if(choice.equals("Si")){
            anum = 14;
            element = "Silicon";
        }
        if(choice.equals("P")){
            anum = 15;
            element = "Phosphorus";
        }
        if(choice.equals("S")){
            anum = 16;
            element = "Sulphur";
        }
        if(choice.equals("Cl")){
            anum = 17;
            element = "Chlorine";
        }
        if(choice.equals("Ar")){
            anum = 18;
            element = "Argon";
        }
        if(choice.equals("K")){
            anum = 19;
            element = "Potassium";
        }
        if(choice.equals("Ca")){
            anum = 20;
            element = "Calcium";
        }
        if(choice.equals("Sc")){
            anum = 21;
            element = "Scandium";
        }
        if(choice.equals("Ti")){
            anum = 22;
            element = "Titanium";
        }
        if(choice.equals("V")){
            anum = 23;
            element = "Vanadium";
        }
        if(choice.equals("Cr")){
            anum = 24;
            element = "Chromium";
        }
        if(choice.equals("Mn")){
            anum = 25;
            element = "Manganese";
        }
        if(choice.equals("Fe")){
            anum = 26;
            element = "Iron";
        }
        if(choice.equals("Co")){
            anum = 27;
            element = "Cobalt";
        }
        if(choice.equals("Ni")){
            anum = 28;
            element = "Nickel";
        }
        if(choice.equals("Cu")){
            anum = 29;
            element = "Copper";
        }
        if(choice.equals("Zn")){
            anum = 30;
            element = "Zinc";
        }
        if(anum > 2){
            anum = anum - 2;
        }
        int vnum = anum % 8;
        int charge = 0;
        if(vnum < 4){
            charge = vnum * (+1);
        }
        if(vnum > 4){
            charge = (vnum - 4) * (-1);
        }
        if(vnum == 4){
            charge = 4;
        }
        System.out.println(element + " has are " + vnum + " valence electrons."
        + " That means the charge, according to the octet rule, is " + charge
        + ".");
    }
}
