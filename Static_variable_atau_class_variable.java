/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_variable_atau_class_variable;

class Display{
    static String type ="Display";
    private String name;
    
    Display(String name){
        this.name = name;
    }
    
    void setType(String typeInput){
        //type = typeInput; // alternatif 1
        // this.type = typeInput; // alternatif 2
        Display.type = typeInput; // alternatif
    }
    
    void show(){
        System.out.println("Display name = " + this.name);
    }
}
public class Static_variable_atau_class_variable {

    public static void main(String[] args) {
        // TODO code application logic here
        Display display1 = new Display("Monitor");
        display1.show();
        
        Display display2 = new Display("Smartphone");
        display2.show();
        
        // tampilkan static variable atau class variable
        
        // kita coba mengganti variable staticnya
        display1.setType("Monitor");
        
        System.out.println("\nMenampilkan static atau class variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);
     
}
}