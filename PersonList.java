import java.util.ArrayList;

class Person {
  private String name;
  private int age;

  Person() {
    this("Person", 20);
  }
  
  Person(String name, int age) {
    setName(name);
    setAge(age);
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return "Name: " + getName() + " | Age: " + getAge();
  }
}

public class PersonList {
  public static void main(String[] args) {
    ArrayList<Person> persons = new ArrayList<Person>();

    persons.add(new Person());
    persons.add(new Person("Sean", 20));
    persons.add(new Person("Christian", 21));

    for (Person person : persons) {
      System.out.println(person.toString());
    }
  }
}
