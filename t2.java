import java.util.ArrayList;

public class t2 {
    public static void main(String[] g){
        ArrayList<Vehicle> vehicl1 = new ArrayList<>(100);
        Garage G = new Garage();
        int exet;
        do {
            menu();
            exet = Garage.in.nextInt();
            switch (exet) {
                case 1:
                    addName();
                    exet = Garage.in.nextInt();
                    switch (exet) {
                        case 1:
                            System.out.println("enter the name of person");
                            String name = Garage.in.next();
                            for(int i =0 ; i< vehicl1.size(); i++){
                                if(name.equalsIgnoreCase(vehicl1.get(i).getNamePerson())){
                                    G.addVehicle(vehicl1.get(i));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("enter the model one char");
                            String model = Garage.in.next();
                            G.addVehicle(vehicl1, model.charAt(0));
                            break;
                        case 3:
                            System.out.println("enter the Year of release");
                            int Year_of_release = Garage.in.nextInt();
                            G.addVehicle(vehicl1 , Year_of_release);
                            break;
                        case 4:
                            System.out.println("enter the Year of release");
                            String Country_of_manufacture = Garage.in.next();
                            G.addVehicle(vehicl1 , Country_of_manufacture);
                            break;
                        case 5:
                            G.addVehicle(addVehicle(vehicl1));
                            break;
                        case -1:
                            exet++;
                            break;
                    }
                    break;
                case 2:
                    mRemovoV();
                    exet = Garage.in.nextInt();
                    switch (exet) {
                        case 1:
                            System.out.println("enter the name of person");
                            String name = Garage.in.next();
                            for(int i =0 ; i< vehicl1.size(); i++){
                                if(name.equalsIgnoreCase(vehicl1.get(i).getNamePerson())){
                                    G.dleteVehicle(vehicl1.get(i));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            System.out.println("enter the model one char");
                            String model = Garage.in.next();
                            G.dleteVehicle(vehicl1, model.charAt(0));
                            break;
                        case 3:
                            System.out.println("enter the Year of release");
                            int Year_of_release = Garage.in.nextInt();
                            G.dleteVehicle(vehicl1 , Year_of_release);
                            break;
                        case 4:
                            System.out.println("enter the Year of release");
                            String Country_of_manufacture = Garage.in.next();
                            G.dleteVehicle(vehicl1 , Country_of_manufacture);
                            break;
                        case -1:
                            exet++;
                            break;
                    }
                    
                    break;
                case 3:
                    G.showAllVehicle();
                    break;
                case 4:
                    addVehicle(vehicl1);
                    break;
            }
            
        } while ( exet != -1);
        
    }
    public static void menu(){
        System.out.println("1 | to add a Vehicle in Garage");
        System.out.println("2 | to remove a Vehicle in Garage");
        System.out.println("3 | to show for all in Garage");
        System.out.println("4 | to add a new Vehicle ");
        System.out.println("to Exet enter -1");
    }
    public static void menu2(){
        System.out.println("1 | to add a new car");
        System.out.println("2 | to add a new Motorcycle");
        System.out.println("3 | to add a new Truck");
    }
    public static void addName(){
        System.out.println("1 | to add the Vehicle have name person");
        System.out.println("2 | to add all the Vehicle have the same model");
        System.out.println("3 | to add all the Vehicle have the Year of release");
        System.out.println("4 | to add all the Vehicle Country of manufacture");
        System.out.println("5 | to add the new Vehicle to Garage");

    }
    public static void mRemovoV(){
        System.out.println("1 | to remove the Vehicle have name person");
        System.out.println("2 | to remove all the Vehicle have the same model");
        System.out.println("3 | to remove all the Vehicle have the Year of release");
        System.out.println("4 | to remove all the Vehicle Country of manufacture");
    }
    public static Vehicle addVehicle(ArrayList<Vehicle> vehicl1){
        menu2();
        int exet = Garage.in.nextInt();
        switch (exet) {
            case 1:
                System.out.println("enter the name of person have the Car");
                String name = Garage.in.next();
                System.out.println("add the Car model one char");
                String c1 = Garage.in.next();
                System.out.println("add the Car Year of release");
                int Y1 =  Garage.in.nextInt();
                System.out.println("add the Car Country of manufacture");
                String c2 = Garage.in.next();
                System.out.println("add the Car Number_of_seats");
                int N1 = Garage.in.nextInt();
                vehicl1.add(new Car(c1.charAt(0), Y1, c2 , name, N1));
                return vehicl1.getLast();
            case 2:
                System.out.println("enter the name of person have the Motorcycle");
                name = Garage.in.next(); 
                System.out.println("add the Motorcycle model one char");
                c1 = Garage.in.next();
                System.out.println("add the Motorcycle Year of release");
                Y1 =  Garage.in.nextInt();
                System.out.println("add the Motorcycle Country of manufacture");
                c2 = Garage.in.next();
                System.out.println("add the Motorcycle Engine_Capacity");
                double N11 = Garage.in.nextInt();
                vehicl1.add(new Motorcycle(c1.charAt(0), Y1, c2 , name, N11));
                return vehicl1.getLast();
            case 3:
                System.out.println("enter the name of person have the Car");
                name = Garage.in.next(); 
                System.out.println("add the Truck model one char");
                c1 = Garage.in.next();
                System.out.println("add the Truck Year of release");
                Y1 =  Garage.in.nextInt();
                System.out.println("add the Truck Country of manufacture");
                c2 = Garage.in.next();
                System.out.println("add the Truck Loading_capacity ton");
                N11 = Garage.in.nextInt();
                vehicl1.add(new Truck(c1.charAt(0), Y1, c2 , name, N11));
                return vehicl1.getLast();
            }return null;

    }

}
