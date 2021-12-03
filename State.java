package Main;

//Интерфейс состояния
public interface State {
    //Вывод информации
    void print();
    //Отправка
    State dispatch();
}
