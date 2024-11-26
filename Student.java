public final class Student {
    private final String name;
    private final Integer roll_no;
    private final String address;
    public Student (String name,Integer roll_no,String address)
    {
        this.name=name;
        this.roll_no=roll_no;
        this.address=address;
    }
    public String getName()
    {
        return name;
    }
    public Integer getRoll_no()
    {
        return roll_no;
    }
    public String getAddress()
    {
        return address;
    }

}
class Studenttesting
{
    public static void main(String args[])
    {
        Student s1= new Student("panneylal",123,"gzb");
        System.out.println("Address:" +s1.getAddress());
        System.out.println("Roll_no:"+s1.getRoll_no());
        System.out.println("Roll_no:"+s1.getName());
    }
}
