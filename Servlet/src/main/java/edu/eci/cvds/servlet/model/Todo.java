package edu.eci.cvds.servlet.model;

public class Todo {
    private int userId;
    private int id = 0;
    private String title;
    private boolean completed;
    /**
     * @return userID que cambia cada 21 id
     */
    public int getUserId() {
        return userId;
    }
    /**
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * @return tittle
     */
    public String getTitle() {
        return title;
    }
    /**
     * @return si completo en este caso es hasta el id 200
     */
    public boolean getCompleted(){
        return completed;
    }
    /**
     * compleated Setter
     * @param completed
     */
    public void setCompleated(boolean completed) {
        this.completed = completed;
    }
    /**
     * id Setter
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * title Setter
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * userID Setter
     * @param_userID
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
}
