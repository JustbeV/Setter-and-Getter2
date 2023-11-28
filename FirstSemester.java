/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstsemester;

/**
 *
 * @author 10
 */
public class FirstSemester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game game=new Game();
        
        
        game.setName("Unicorn");
        game.setStrength(999);
        game.setSpeed(999);
        
        
        double damages= game.getReceivedDamage();
        
        
        
        System.out.println("Hero name:"+ game.getName());
        System.out.print("Hero strength:"+ game.getStrength());
        System.out.println("  Hero speed:"+ game.getSpeed());  
        System.out.println("Hero received damages from opponent:"+ damages);
        double mad=damages;
        System.out.println("Flying: " + game.getFlyingOrNot(mad));
        System.out.println("How many heroes:"+ Game.getHeroes());
        
    }
    
}
