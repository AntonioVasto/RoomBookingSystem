
package booking.comp.ia;
//have a limited number of classroms that can be booked 
import java.util.*;
public class BookingCompIA {
public static void main(String[] args) {
new Menu().setVisible(true);
Scanner fetch = new Scanner(System.in);   
ArrayList <Room> classRoom = new ArrayList <Room>(); 
ArrayList <Room> bookedRoom = new ArrayList <Room>();

    //new Menu().setVisible(true);
    for (int i = 0; i < 11; i++){
     Room x = new Room (i, true);
     classRoom.add(x);
    }
    
    System.out.println(classRoom );
    System.out.println("Hello Mr.Vasto, would you like to: \n 1 - View room available \n 2 - View your booked room \n 3 - Book a room \n 4 - Cancel a reservation ");
    String num = fetch.nextLine();

while (!num.equals("0")){ 
    
    if (num.equals ("1")){
        System.out.println(classRoom);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Would you like to: \n 1 - View room available \n 2 - View your booked room \n 3 - Book a room \n 4 - Cancel a reservation ");
        num = fetch.nextLine();
    }
    
    
    if (num.equals ("2")){
        if (bookedRoom.isEmpty()){
            System.out.println("You have no booked rooms");
        }else{
            System.out.println(bookedRoom);
        }
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Would you like to: \n 1 - View room available \n 2 - View your booked room \n 3 - Book a room \n 4 - Cancel a reservation ");
    num = fetch.nextLine();
    }
    
    
    if (num.equals("3")){
        System.out.println("Which room?: ");
        String ans = fetch.nextLine();
        int result = Integer.parseInt(ans);
        
        for (int i = 0; i < classRoom.size(); i++){
            if (result == classRoom.get(i).getRoomNum()){
            System.out.println("Room" + classRoom.get(i).getRoomNum() + " is now booked");
            classRoom.get(i).setAvail(false);
            bookedRoom.add(classRoom.get(i));
            classRoom.remove(classRoom.get(i)); 
            }//else if (result != classRoom.get(i).getRoomNum()){
               // System.out.println("This room does not exist or it is not available");
            //}
        }
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Would you like to: \n 1 - View room available \n 2 - View your booked room \n 3 - Book a room \n 4 - Cancel a reservation "); 
    num = fetch.nextLine();
    }
    
   for (int i = 0; i < 11; i ++){
   if (num.equals ("4")){
        if (bookedRoom.isEmpty()){
            System.out.println("You have no rooms booked");
        }
        else{
            System.out.println("Which room(s) would you like to cancel? " + bookedRoom);
            String ans = fetch.nextLine();
            int result = Integer.parseInt(ans);
            if (result == bookedRoom.get(i).getRoomNum()){
                System.out.println("Room" + bookedRoom.get(i) + "has been removed from your reservation list" );
                bookedRoom.remove(bookedRoom.get(i));
                
            }
        }
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("Would you like to: \n 1 - View rooms available \n 2 - View your booked room \n 3 - Book a room \n 4 - Cancel a reservation ");
    num = fetch.nextLine();
    }
    }
    
}
    
    
    }
}

