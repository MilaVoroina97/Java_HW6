package HW6;
import java.util.HashSet;
import java.util.Set;
public class task1 {

    public static void main(String[] args) {
        Notebook hp_pailion_g6 = new Notebook ("hp_pailion_g6", true, 500, "16", 
        "Windows", "black"); 
        Notebook hp_galaxy_x64 = new Notebook("hp_galaxy_x64",true, 500, "8",
         "Windows", "red");
        Notebook samsung_a52 = new Notebook("samsung_a52", false, 700, "8", "Windows", "black");
        Notebook samsung_m31s = new Notebook("samsung_m31s", false, 1100, "16",
         "Linux", "black");
         Notebook lenovo_gtx76 = new Notebook("lenovo_gtx76", true, 900, "32",
          "Windows", "white");
        Notebook macbook_14pro = new Notebook("macbook_14pro", false, 700, "8", "IOS", "white");
        Notebook asus_x515 = new Notebook("asus_x515", true, 500, "4",
         "Windows", "red");
        Notebook acer_air5 = new Notebook("acer_air5", true, 900, "8", 
        "Windows", "black"); 
        Notebook acer_a313 = new Notebook("acer_a313", false, 110, "32", 
        "IOS", "red");

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(hp_pailion_g6);      
        notebooks.add(hp_galaxy_x64);
        notebooks.add(samsung_a52);
        notebooks.add(samsung_m31s);
        notebooks.add(lenovo_gtx76);
        notebooks.add(macbook_14pro);
        notebooks.add(asus_x515);
        notebooks.add(acer_air5);
        notebooks.add(acer_a313);

        Notebook selecNotebook = new Notebook();
        System.out.println(selecNotebook.filter(notebooks));
        
    }
}
