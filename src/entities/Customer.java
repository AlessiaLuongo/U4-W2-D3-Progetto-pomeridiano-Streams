package entities;

import java.util.Random;

public class Customer {

    private Long id;
    private String name;
    private Integer tier;

//CONSTRUCTOR
    public Customer( String name ) {
        Random idRandomNumber = new Random();
        this.id = idRandomNumber.nextLong();
        this.name = name;
        this.tier = idRandomNumber.nextInt();
    }

//GETTERS AND SETTERS


    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

//TO STRING

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
