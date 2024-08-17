/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author rk
 */
public class Link{
    public String characterName;
    private String description;
    private String picture;
    public Link next;
    
    //Constructure
    public Link(String characterName,String description,String picture){
        this.characterName = characterName;
        this.description = description;
        this.picture = picture; 
    }
    
    //get methods for private properties
    public String get_description(){
        return description;
    }
    
    public String picture(){
        return picture;
    }

}
