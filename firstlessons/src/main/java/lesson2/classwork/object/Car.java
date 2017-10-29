package lesson2.classwork.object;


public class Car implements Comparable<Car>{

    private Integer id;
    private String name;
    private Double weihgt;

    public Car(Integer id, String name, Double weihgt) {
        this.id = id;
        this.name = name;
        this.weihgt = weihgt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeihgt() {
        return weihgt;
    }

    public void setWeihgt(Double weihgt) {
        this.weihgt = weihgt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!id.equals(car.id)) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        return weihgt.equals(car.weihgt);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + weihgt.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weihgt=" + weihgt +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        if(o.getWeihgt()>this.getWeihgt()){
            return 1;
        }
        if(o.getWeihgt()<this.getWeihgt()){
            return -1;
        }
        return 0;
    }
}
