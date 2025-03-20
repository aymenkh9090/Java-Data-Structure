package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarArrayList implements CarManagement<Car>{

   List<Car> carList;

    public CarArrayList() {
      carList = new ArrayList<>();
    }

    @Override
    public void addCar(Car car) {   carList.add(car);}

    @Override
    public void removeCar(Car car) {
        carList.remove(car);
    }

    @Override
    public void removeById(int id) {
        carList.remove(id);
    }

    @Override
    public void display() {
        carList.forEach(System.out::println);
    }

    @Override
    public boolean searchCarByName(String name) {
        for(Car car:carList){
            return car.getName() ==name;
        }
       return false;
    }

    @Override
    public boolean searchCar(Car car) {
        return carList.contains(car);
    }

    @Override
    public void sortById() {
        Collections.sort(carList);
    }

    @Override
    public void sortByNameThenByReference() {
        Comparator<Car> NameComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        //comparator avec lambda expression
        Comparator<Car> NameComparatorWithLambda = ((o1, o2) -> o1.getName().compareTo(o2.getName()));

        Comparator<Car> compareWithReference = ((o1,o2) ->o1.getReference().compareTo(o2.getReference()));
    }


    public static void main(String[] args) {

        CarArrayList carList = new CarArrayList();
        carList.addCar(new Car(1,"citroen","C3"));
        carList.addCar(new Car(2,"clio","bombe"));
        carList.addCar(new Car(3,"wolswagen","polo7"));
        carList.addCar(new Car(4,"peuageot","206"));
        System.out.println("*****Before Removing*****");
        carList.display();
        System.out.println("*****After Removing*****");
        carList.removeById(3);
        carList.display();
        System.out.println(carList.searchCarByName("citroen"));
        System.out.println(carList.searchCarByName("bmw"));




    }



















}
