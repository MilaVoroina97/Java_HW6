package HW6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Notebook {
    private String model;
    private boolean DVD;
    private int hardDisk;
    private String operativeMemory;
    private String operatingSystem;
    private String color;

    public Notebook(){
    }

    public Notebook(String model,boolean DVD, int hardDisk,String operativeMemory, String operatingSystem, String color){
        this.model = model;
        this.DVD =DVD;
        this.hardDisk = hardDisk;
        this.operativeMemory = operativeMemory;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String Model(){return model;}
    public boolean hasDVD(){return DVD;}
    public int getHardDisk(){return hardDisk;}
    public String getOperativeMemory(){return operativeMemory;}
    public String getOperatingSystem(){return operatingSystem;}
    public String getColor(){return color;}

    public Set<Notebook> filter(Set<Notebook> notebooks){
        Scanner sc = new Scanner(System.in);
        Set<Notebook> serialNotebooks = new HashSet<>(notebooks);
        System.out.println("Please choose the criteria to filter and find neccessary laptop: " + 
        "\n1. Size hard disk\n2. Size operatyvi memory\n3. Operating system\n4. Color");
        String userInput = sc.nextLine();
        for(int i = 0; i < userInput.length(); i++){
            if(1 == Character.getNumericValue(userInput.charAt(i))){
                System.out.println("Please choose size (GB) of hard disk: 500, 700, 900, 1100");
                String userHardDisk = sc.nextLine();
                int hardDiskSize = Integer.parseInt(userHardDisk);
                for(Notebook n : notebooks){
                    if(hardDiskSize != n.hardDisk) serialNotebooks.remove(n);
                }
            }if(2 == Character.getNumericValue(userInput.charAt(i))){
                System.out.println("Please choose the operative memory (GB) : 4, 8, 16,32");
                String userOperativeMemory = sc.nextLine();
                for(Notebook n : notebooks){
                    if((userOperativeMemory.equals(n.operativeMemory)) == false) serialNotebooks.remove(n);
                }
            }if(3 == Character.getNumericValue(userInput.charAt(i))){
                System.out.println("Please choose the operating system : Windows, IOS, Linux");
                String userOperatingSystem = sc.nextLine();
                for(Notebook n : notebooks){
                    if((userOperatingSystem.equals(n.operatingSystem)) == false) serialNotebooks.remove(n);
                }
            }if(4 == Character.getNumericValue(userInput.charAt(i))){
                System.out.println("Please choose color : Windows, black, white, red, blue");
                String userColor = sc.nextLine();
                for(Notebook n : notebooks){
                    if((userColor.equals(n.color)) == false) serialNotebooks.remove(n);
                }
            }
        }
        sc.close();
        return serialNotebooks;

    } 

    @Override
    public String toString(){
        return "\nLaptop  ->  " + model + ",\nDVD = " + DVD + ",\nhardDisk = " + hardDisk + ",\noperativeMemory = " + operativeMemory
        + ",\noperatingSystem = " + operatingSystem + ",\ncolor = " + color + "\n";
    }




}
