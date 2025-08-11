package org.example;

public class Singeltonobject {

    private static  Singeltonobject object;

    private Singeltonobject(){

    }
    public static Singeltonobject getInstance(){
        if(object==null){
            object=new Singeltonobject();
        }
        return object;
    }
}
