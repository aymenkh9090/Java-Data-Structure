package list;

public class Car {
    private int id;
    private String name;
    private String reference;

    //constructor
    public Car(){

    }
    public Car(int id,String name,String reference){
        this.id=id;
        this.name=name;
        this.reference=reference;
    }
    //Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    //equals methods
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(o instanceof Car car))
            return false;
        return this.getName()== car.getName();
    }

    // method to string
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}
