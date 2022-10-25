package edu.eci.cvds.servlet.model;

public class Todo {
    private int userId;
    private int id;
    private String title;
    private boolean completed;
    public Todo(){

    }
    /**
     * id  User Setter
     */
    public void setUserId(int userId){
        this.userId=userId;
    }
    /**
     * id Setter
     */
    public void setId(int id){
        this.id=id;
    }
    /**
     * title Setter
     */
    public void setTitle(String title){
        this.title=title;
    }
    /**
     * compleated Setter
     */
    public void setCompleted(boolean completed){
        this.completed=completed;
    }
    /**
     * id User getter
     */
    public int getUserId(){
        return userId;
    }
    /**
     * id getter
     */
    public int getId() {
        return id;
    }
    /**
     * title getter
     */
    public String getTitle(){
        return title;
    }
    /**
     * compleated getter
     */
    public boolean getCompleted(){
        return completed;
    }
}
