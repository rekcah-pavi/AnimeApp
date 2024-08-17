/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author rk
 */
public class LinkedList{
    private Link first;

    public LinkedList(){
        this.first = null;
    }

    public Link getFirst(){
        return first;
    }

    public boolean isEmpty(){
        return first == null;
    } 

    public void insertFirst(String cn, String des ,String pic){
        Link tmp = new Link(cn,des ,pic);
        tmp.next = first;
        first = tmp;
        
    }

    public void insertLast(String cn, String des ,String pic){
        
        Link tmp = new Link(cn,des ,pic);
        if (isEmpty()){
            first = tmp;
            return;
        }
        Link current = first;
        while(current.next!= null){           
            current = current.next;
        }
        
        current.next = tmp;

    }

    public Link deleteFirst(){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return null;
        }
        Link tmp = first;
        first = first.next;
        return tmp;
    }
    
    public void insertBefore(String exName,String cn, String des,String pic){

        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return;
        }

        if (first.characterName.equals(exName)){
            insertFirst(cn,des ,pic);
            return;
        }

        Link current = first;
         while(current.next!= null){
            if(current.next.characterName.equals(exName)){
                Link tmp = new Link(cn,des ,pic);
                tmp.next = current.next;
                current.next = tmp;
                return;

            }
            current = current.next;
         }
        
        System.out.println("Error target id not found");

    }
    
    public Link find_next(String name){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return null;
        }
        
        Link current = first;
        while(current != null){
            if(current.characterName.equals(name)){
                return current.next;
            }
            current = current.next;
        }
        return null;
        
        
    }

    public Link find(String name){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return null;
        }

        Link current = first;
        while(current != null){
            if(current.characterName.equals(name)){
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Link delete(String name){
        if (isEmpty()){
            System.out.println("Error linked list is empty");
            return null;
        }


        if (first.characterName.equals(name)){
            return deleteFirst();
        }



        Link current = first;
        while(current.next != null){
           
            boolean dd = current.characterName.equals(name);
            if(dd){
                Link tmp = current.next;
                current.next = current.next.next;
                return tmp;
            }
            current = current.next;
        }

        System.out.println("Id not found");
        return null;



    }
}
