/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking.comp.ia;

public class Room {
private int roomNum;
private boolean isAvailable;
    
    public Room (int roomNum, boolean isAvailable){
        this.roomNum = roomNum;
        this.isAvailable = isAvailable;
    }
    
    public int getRoomNum(){
    return roomNum;
    }
    
    public boolean getIsAvailable(){
        return isAvailable;
    }
    
    public void setAvail(boolean x){
        isAvailable = x; 
    }
    
    public String toString(){
        return("Room: " + roomNum + " Available: " + isAvailable);
    } 
    
}
