package edu.eci.cvds.servlet;
import java.util.ArrayList;
import java.util.Random;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.*;
@ManagedBean(name = "guessBean")
@ApplicationScoped

public class BackingBean {
    private int number;
    private int attemps;
    private int prize;
    private String gameState;
    private ArrayList<Integer> NumberOfAttempts;
    public BackingBean() {
        restart();
    }

    /**obtiene numero
     *
     * @return
     */
    public int getNumber() {
        return number;
    }
    /**obtiene intentos realizados
     *
     * @return
     */
    public int getAttemps() {
        return attemps;
    }
    /**obtiene premio acumulado
     *
     * @return
     */
    public int getPrize() {
        return prize;
    }
    /**obtiene estado del juego: si gano o no
     *
     * @return
     */
    public String getGameState() {
        return gameState;
    }

    public void setAttemps(int attemps) {
        this.attemps = attemps;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }

    /**
     * realiza el aumento de puntos y cambia estado de juego
     * @param guess
     */
    public void guess(int guess) {
        if(number == guess) {
            gameState = "Ganaste con " + attemps + "intentos  " ;
        } else if (prize == 0){
            gameState = "Perdiste";
        }else {
            NumberOfAttempts.add(guess);
            prize -= 10000;
            attemps ++;
        }
    }
    public void restart() {
        Random numberRandom = new Random();
        number = numberRandom.nextInt(100);
        prize = 100000;
        attemps = 0;
        gameState = "Jugando";
        NumberOfAttempts = new ArrayList<>();

    }
}
