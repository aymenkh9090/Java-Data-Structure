package list;

public interface CarManagement <T>{

    void addCar(T t);
    void removeCar(T t);
    void removeById(int id);
    void display();
    boolean searchCarByName(String name);
    boolean searchCar(T t);
    void sortById();
    void sortByNameThenByReference();





}
