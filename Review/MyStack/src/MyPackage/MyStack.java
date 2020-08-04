package MyPackage;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    public List element=new ArrayList();

    public void push(Object a){
        try{
        if(a !=null) {

            element.add(a);
            System.out.println(a+" element successfully added :)");
        }
        else{
            throw new NullPointerException();
        }
        }catch(NullPointerException e){
            System.out.println("Null value cannot be passed into the stack ");
        }
    }


    public Object pop(){
        int index= element.size();
        try{
        if(index >=0){

            return  element.remove(index-1);
        }
        else{
            throw new NullPointerException();
        }}catch(NullPointerException e){
            System.out.println("Stack is empty ");
        }
       return null;
    }

    public Object getTop(){
        Object Temp=null;
        try{
      if(element.size()!=0){
         Temp= element.get(element.size()-1);

      }
      else{
          throw new NullPointerException();
      }}catch(NullPointerException e){
            System.out.println("Stack is empty ");
        }
        return Temp;
    }

    public void displayStack(){
        System.out.println(element);
        System.out.println("size of stack"+ element.size());
    }

}

class Test{
    public static void main(String[] args) {
        MyStack s=new MyStack();


        s.displayStack();


    }
}
