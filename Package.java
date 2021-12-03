package Main;


//Поссылка
public class Package {

    //Текущее состояние
    State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    //Следующее состояние
    public void dispatch(){
        this.currentState = currentState.dispatch();
    }

    public void print(){
        this.currentState.print();
    }
}
