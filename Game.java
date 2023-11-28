/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstsemester;

/**
 *
 * @author 10
 */
public class Game {
    
    private String name;
    private int strength;
    private int speed;
    private double receivedDamages;
    private static int heroCount;
    
    Game(){
        heroCount++; //counts how many heroes crated.
    }
    
    public static int getHeroes(){
        return heroCount;
        
    }
    public String getName(){
        return this.name;
    }
    public int getStrength(){
        return this.strength;
    }
    public int getSpeed(){
        return this.speed;
    }
    
   
    public double getReceivedDamage(){
        
        receivedDamages=(speed+strength)/2; //adding the stats then dividing by damages from opponent.
        
        return this.receivedDamages;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setStrength(int strength){
        this.strength=strength;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setReceivedDamages(double receivedDamages){
        this.receivedDamages=receivedDamages;
    }
    //if the damage received over 500 then the hero can fly because scared or low hp.
    public String getFlyingOrNot(double damages){
        if(damages >=500)
            return "true";
        else
            return "false";
    }
 
}
