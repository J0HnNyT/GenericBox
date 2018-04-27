/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericbox;

public class Box<T> {
    private T Contents;
    private T nextNode;
    
    Box(T contents, T next){
        this.Contents = contents;
        this.nextNode = next;
        //this.nextNode = Inside
    }
    
    public void setContents(T item){
        this.Contents = item;
    }
    
    public T getContents(){
       return this.Contents;
    }
    
    public void setNextNode(T next){
        this.nextNode = next;
    }
    
    public T getNextNode(){
       return this.nextNode;
    }
    
    
}//End Box class.
