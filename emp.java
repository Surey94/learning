 class emp{
public void show(int id,String name,Double sal){
System.out.println("id:"+id);
System.out.println("name:"+name);
System.out.println("salary:"+sal);
}
public class sol{
public static void main(String[] args){
emp obj=new emp();
obj.show(100,"ABC",25000.00);
}
}
}
