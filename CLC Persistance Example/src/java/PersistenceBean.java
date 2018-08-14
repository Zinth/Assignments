
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
/**
 *
 * @author: Chris
 * @date: August 11, 2018
 * @about: A simple managed bean to show how to make a bean persistent.
 */

@Named
@SessionScoped
public class PersistenceBean implements Serializable {
    //To be Persistent a JavaBean must implement Serializable.
    
    //The propery that will persist after restart
    private String name = null;
    
    /**
     * Default constructor needed in every JavaBean
     */
    public PersistenceBean(){
        
    }
    
    /**
     * Method to return String name if one has been set
     * @return string
     */
    public String getName(){
        if(name == null){
            return "Your Name Here!";
        }else{
            return name;
        }
    }
    
    /**
     * Method to set String name.
     * @param name String
     */
    public void setName(String name){
        this.name = name;
    }
}
