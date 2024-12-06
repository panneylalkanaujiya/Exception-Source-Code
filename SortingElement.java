import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class SortingElement
{
//sorinting the data on the bases of id nad salary
        int id;
        String name;
        Double salary;
 public  SortingElement(int id,String name,Double salary)
 {
     this.id=id;
     this.name=name;
     this.salary=salary;
 }

    public int getId() {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public Double getSalary()
    {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "SortingElement{id="+id+",name="+name+",salary=+salary+}";

    }
}
class Sortingdata
{
    public static void main(String args[])
    {
       List<SortingElement> sortingElementList= Arrays.asList(
               new SortingElement(12,"panneylal",1290.00),
               new SortingElement(10,"sweta",12345.90),
               new SortingElement(23,"rahul",45.54));

       //sorting by id tham salary
        List<SortingElement>sortedtonidandsalary=sortingElementList.stream()
                .sorted(Comparator.comparingInt(SortingElement::getId))
               // .thenComparingDouble(SortingElement::getSalary)
                .collect(Collectors.toList());
        sortedtonidandsalary.forEach (System.out::println);
    }
}
