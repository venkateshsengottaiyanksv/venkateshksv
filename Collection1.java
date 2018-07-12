package ksv;
import java.util.*;
public class Collection1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> obj=new ArrayList<String>();
   obj.add("arun");
   obj.add("vel");
   obj.add("ram");
   System.out.println("the current name is"+obj);
    obj.add(0,"ksv");
    obj.add(1,"Raj");
    System.out.println("the new name is"+obj);
    obj.remove("arun");
    obj.remove(0);
   System.out.println("the new name1 is"+obj);
}

}
