/*class employee
{
float salery=12034;
}
class programer extends employee
{
int bonus=12930;

public static void main(String[] args)
{
programer m=new programer();
Syetem.out.println("programer of salery is:" +m.salery);
Syetem.out.println("bonus of programer is:" +m.bonus);
}
}*/
class Employee{  //inhertance
 float salary=40000;  
}  
class Programmer extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
}  
}  