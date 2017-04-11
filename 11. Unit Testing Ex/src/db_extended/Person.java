package db_extended;

import javax.naming.OperationNotSupportedException;

/**
 * Created by Sim0o on 4/3/2017.
 */
public class Person {
    private Long id;
    private String username;

    public Person(Long id, String username) throws OperationNotSupportedException {
        this.setUsername(username);
        this.setId(id);
    }

    public String getUsername(){
        return this.username;
    }

    public Long getId(){
        return this.id;
    }

    private void setUsername(String username) throws OperationNotSupportedException {
        if(username == null || username.equals(" ")|| username.isEmpty()){
            throw new OperationNotSupportedException("Username cannot be null");
        }
        this.username = username;
    }

    private void setId(Long id) throws OperationNotSupportedException {
        if(id == null){
            throw new OperationNotSupportedException("ID cannot be null");
        }
        this.id = id;
    }
}
