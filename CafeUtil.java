import java.util.ArrayList;
import java.util.Arrays;



public class CafeUtil{
    
    public int getStreakGoal() {
        int suma=0;
        for (int i = 0; i<=10; i++){
            suma += i;
        } 
        return suma;
    }

    public double getOrderTotal(double[] prices){
        double suma=0;
        for (int i = 0; i<prices.length; i++){
            suma += prices[i];
        } 
        return suma;
    }

    public static void displayMenu(ArrayList<String>menuItems){

    for( int i=0; i < menuItems.size(); i++ ){
            System.out.println( i + " " + menuItems.get(i) );
        }    
    }

    public static void addCustomer(ArrayList<String>customers){
        System.out.println ("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hola %s",userName));
        System.out.println("Hay" + customers.size() + "personas frente a ti");
        customers.add(userName);
        System.out.println(Arrays.toString(customers.toArray()));
    }
}
