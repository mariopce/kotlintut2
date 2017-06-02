package eu.saramak.tut1;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * Created by saramakm on 01/06/2017.
 */
public class Consumer2Java {

    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotNull String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Consumer2Java that = (Consumer2Java) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        String name = "";
        CustomerKotlin kotlin = new CustomerKotlin(1, name,"m@m.pl");
        kotlin.someProperty = "var is not final";
        Status status = kotlin.change();

        String ss = TopLevelFunKt.prefix("1", "2");
        System.out.println(ss);
        System.out.println(status);
        System.out.println(kotlin.someProperty);
        System.out.println(kotlin.getEmail());
        try {
            kotlin.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
