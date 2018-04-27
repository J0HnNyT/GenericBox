/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbox;

public class MainGenericBox {


    public static void main(String[] args) {
        
        Box<Integer> intBox = new Box<>(3,5);
        
        System.out.println(intBox.getContents());
        System.out.println(intBox.getNextNode());
        
        intBox.setContents(32);
        intBox.setNextNode(88);
        
        System.out.println(intBox.getContents());
        System.out.println(intBox.getNextNode());
        
        Box<String> stringBox = new Box<>("Strings", "in here");
        
        System.out.println(stringBox.getContents());
        System.out.println(stringBox.getNextNode());
        
        stringBox.setContents("Different Strings");
        stringBox.setNextNode("are now in here");
        
        System.out.println(stringBox.getContents());
        System.out.println(stringBox.getNextNode());
        
    }
    
}
