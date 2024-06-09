import java.util.ArrayList;
import java.util.Scanner;

public abstract class Vehicle {
    private String namePerson;
    private char model;
    private int yers;
    private String cuntry ; 
    public Vehicle(char model , int yers, String cuntry , String P){
        namePerson = P;
        this.model = model;
        this.yers = yers;
        this.cuntry = cuntry;
    }
    public abstract void displayInfo();

    public void setModel(char model){
    this.model = model;
    }

    public void setYers(int yers){
    this.yers =yers;
    }

    public void setCuntry(String cuntry){
    this.cuntry = cuntry;
    }

    public char getModel( ){
        return model;
    }
    
    public int getYers( ){
        return yers;
    }
    public String getCuntry( ){
        return cuntry;
    }
    public String getNamePerson(){
        return namePerson;
    }
    public void setnamePerson(String namePerson){
        this.namePerson = namePerson;
    }
}


class Car extends Vehicle{
    private int Number_of_seats;

    public Car(char model , int yers, String cuntry ,String P , int Number_of_seats){
        super(model , yers , cuntry,P );
        this.Number_of_seats= Number_of_seats;
    }

    public void displayInfo(){
        System.out.println("infrmation of the Car :");
        System.out.println("the car model is " + getModel());
        System.out.println("the car yers is " + getYers());
        System.out.println("the car cuntry is " + getCuntry());
        System.out.println("the car Number_of_seats is " + getNumber_of_seats());
    }

    public void setNumber_of_seats(int Number_of_seats){
    this.Number_of_seats= Number_of_seats;
    }
    public int getNumber_of_seats( ){
        return Number_of_seats;
    }   


}
class Motorcycle  extends Vehicle{
    private double Engine_Capacity;

    public Motorcycle(char model , int yers, String cuntry ,String P , double Engine_Capacity){
        super(model , yers , cuntry , P);
        this.Engine_Capacity= Engine_Capacity;
    }
    public void displayInfo(){
        System.out.println("infrmation of the Motorcycle :");
        System.out.println("the Motorcycle model is " + getModel());
        System.out.println("the Motorcycle yers is " + getYers());
        System.out.println("the Motorcycle cuntry is " + getCuntry());
        System.out.println("the Motorcycle Engine_Capacity is " + getEngine_Capacity());

    }

    public void setEngine_Capacity(double Engine_Capacity){
    this.Engine_Capacity=Engine_Capacity;

    }
    public double getEngine_Capacity( ){
        return Engine_Capacity;
    } 
    
}
class Truck extends Vehicle{
    private double Loading_capacity;

    public Truck(char model , int yers, String cuntry, String P  , double Loading_capacity){
        super(model , yers , cuntry, P );
        this.Loading_capacity= Loading_capacity;
    }
    public void displayInfo(){
        System.out.println("infrmation of the Truck :");
        System.out.println("the Truck model is " + getModel());
        System.out.println("the Truck yers is " + getYers());
        System.out.println("the Truck cuntry is " + getCuntry());
        System.out.println("the Truck Loading_capacity is " + getLoading_capacity());
    }

    public void setLoading_capacity(double Loading_capacity){
    this.Loading_capacity=Loading_capacity;
    }
    public double getLoading_capacity( ){
        return Loading_capacity;
    }     
}

class Garage {
    public static final Scanner in = new Scanner(System.in);
    private double c = 0;
    private final int MAX = 100;
    private final int MIN = 0;
    private ArrayList<Vehicle> V = new ArrayList<>(MAX);
    
    public void addVehicle(Vehicle v){
        if(c <= MAX && c >= MIN){
            if (v instanceof Car) {
            c++;
            this.V.add(v);
            }else if (v instanceof Truck) {
            c +=2;
            this.V.add(v);
            }else if(v instanceof Motorcycle){
            c += 0.2;
            this.V.add(v);   
            }
        }else{
            System.out.println("Sore the Garage is Full");
        }
    }
    public void addVehicle(ArrayList<Vehicle> v , char model  ){
        if(c <= MAX && c >= MIN){
            ArrayList<Vehicle> test = new ArrayList<>(MAX);
            for(int i = 0 ; 0 < V.size(); i++){
                if(V.get(i).getModel() == model){
                    test.add(v.get(i));
                }
            }
            System.out.println("You sure to add this");
            System.out.println(test);
            System.out.println("yes enter y\\\\Y");
            String Y = in.next();
            if (Y.equals("y") && Y.equals("Y")) {
                for(int i =0; i < test.size() ; i++){
                    if (test.get(i) instanceof Car && c <= MAX && c >= MIN) {
                        c++;
                        this.V.add(test.get(i));
                        }else if (test.get(i) instanceof Truck && c <= MAX && c >= MIN) {
                        c +=2;
                        this.V.add(test.get(i));
                        }else if(test.get(i) instanceof Motorcycle && c <= MAX && c >= MIN){
                        c += 0.2;
                        this.V.add(test.get(i));   
                        }
                        else{
                        System.out.println("Sore the Garage is Full");
                    }
                    
                }
            }
            
        }else{
            System.out.println("the Garage is Full");
        }
    }
    public void addVehicle(ArrayList<Vehicle> v , String cuntry  ){
        if(c <= MAX && c >= MIN){
            ArrayList<Vehicle> test = new ArrayList<>(MAX);
            for(int i = 0 ; 0 < V.size(); i++){
                if(V.get(i).getCuntry().equals(cuntry)){
                    test.add(v.get(i));
                }
            }
            System.out.println("You sure to add this");
            System.out.println(test);
            System.out.println("yes enter y\\\\Y");
            String Y = in.next();
            if (Y.equals("y") && Y.equals("Y")) {
                for(int i =0; i < test.size(); i++){
                    if (test.get(i) instanceof Car && c <= MAX && c >= MIN) {
                        c++;
                        this.V.add(test.get(i));
                    }else if (test.get(i) instanceof Truck && c <= MAX && c >= MIN) {
                        c +=2;
                        this.V.add(test.get(i));
                    }else if(test.get(i) instanceof Motorcycle && c <= MAX && c >= MIN){
                        c += 0.2;
                        this.V.add(test.get(i));   
                    }else{
                        System.out.println("Sore the Garage is Full");
                    }
                    
                }
            }
            
        }else{
            System.out.println("the Garage is Full");
        }
    }
    public void addVehicle(ArrayList<Vehicle> v , int yers  ){
        if(c <= MAX && c >= MIN){
            ArrayList<Vehicle> test = new ArrayList<>(MAX);
            for(int i = 0 ; 0 < V.size(); i++){
                if(V.get(i).getYers() == yers){
                    test.add(v.get(i));
                }
            }
            System.out.println("You sure to add this");
            System.out.println(test);
            System.out.println("yes enter y\\\\Y");
            String Y = in.next();
            if (Y.equals("y") && Y.equals("Y")) {
                for(int i =0; i < test.size() ; i++){
                    if (test.get(i) instanceof Car && c <= MAX && c >= MIN) {
                        c++;
                        this.V.add(test.get(i));
                    }else if (test.get(i) instanceof Truck && c <= MAX && c >= MIN) {
                        c +=2;
                        this.V.add(test.get(i));
                    }else if(test.get(i) instanceof Motorcycle && c <= MAX && c >= MIN){
                        c += 0.2;
                        this.V.add(test.get(i));   
                    }else{
                        System.out.println("Sore the Garage is Full");
                    }
                    
                }
            }
            
        }else{
            System.out.println("the Garage is Full");
        }
    }
    
    public void dleteVehicle(Vehicle v){
            if (v instanceof Car) {
            c--;
            this.V.remove(v);
            }else if (v instanceof Truck) {
            c -=2;
            this.V.remove(v);
            }else if(v instanceof Motorcycle){
            c -= 0.2;
            this.V.remove(v);   
            }
        
    }
    public void dleteVehicle(ArrayList<Vehicle> v , char model  ){
            ArrayList<Vehicle> test = new ArrayList<>(MAX);
            for(int i = 0 ; 0 < V.size(); i++){
                if(V.get(i).getModel() == model){
                    test.add(v.get(i));
                }
            }
            System.out.println("You sure to remove this");
            System.out.println(test);
            System.out.println("yes enter y\\\\Y");
            String Y = in.next();
            if (Y.equals("y") && Y.equals("Y")) {
                for(int i =0; i < test.size(); i++){
                    if (test.get(i) instanceof Car) {
                        c--;
                        this.V.remove(test.get(i));
                    }else if (test.get(i) instanceof Truck) {
                        c -=2;
                        this.V.remove(test.get(i));
                    }else if(test.get(i) instanceof Motorcycle){
                        c -= 0.2;
                        this.V.remove(test.get(i));   
                    }else{
                        System.out.println("Sore the Garage is Full");
                    }
                    
                }
            }  
    }
    public void dleteVehicle(ArrayList<Vehicle> v , String cuntry  ){
            ArrayList<Vehicle> test = new ArrayList<>(MAX);
            for(int i = 0 ; 0 < V.size(); i++){
                if(V.get(i).getCuntry().equals(cuntry)){
                    test.add(v.get(i));
                }
            }
            System.out.println("You sure to add this");
            System.out.println(test);
            System.out.println("yes enter y\\\\Y");
            String Y = in.next();
            if (Y.equals("y") && Y.equals("Y")) {
                for(int i =0; i < test.size(); i++){
                    if (test.get(i) instanceof Car) {
                        c--;
                        this.V.remove(test.get(i));
                    }else if (test.get(i) instanceof Truck) {
                        c -=2;
                        this.V.remove(test.get(i));
                    }else if(test.get(i) instanceof Motorcycle){
                        c -= 0.2;
                        this.V.remove(test.get(i));   
                    }else{
                        System.out.println("Sore the Garage is Full");
                    }
                    
                }
            }
    }
    public void dleteVehicle(ArrayList<Vehicle> v , int yers  ){
        if(c <= MAX && c >= MIN){
            ArrayList<Vehicle> test = new ArrayList<>(MAX);
            for(int i = 0 ; 0 < V.size(); i++){
                if(V.get(i).getYers() == yers){
                    test.add(v.get(i));
                }
            }
            System.out.println("You sure to add this");
            System.out.println(test);
            System.out.println("yes enter y\\\\Y");
            String Y = in.next();
            if (Y.equals("y") && Y.equals("Y")) {
                for(int i =0; i < test.size(); i++){
                    if (test.get(i) instanceof Car) {
                        c--;
                        this.V.remove(test.get(i));
                    }else if (test.get(i) instanceof Truck) {
                        c -=2;
                        this.V.remove(test.get(i));
                    }else if(test.get(i) instanceof Motorcycle){
                        c -= 0.2;
                        this.V.remove(test.get(i));   
                    }else{
                        System.out.println("Sore the Garage is Full");
                    }
                    
                }
            }
            
        }else{
            System.out.println("the Garage is Full");
        }
    }
    public void showAllVehicle(){
        for(int i = 0 ; i < V.size() ; i++){
            V.get(i).displayInfo();
        }

    }
}
