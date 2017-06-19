package com.jsf.pf.primefaces;

import com.google.gson.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Gson gson2 = new Gson();
        //System.out.println( "Hello World to Angel!" + gson2.toString() );
        
        
        
        Gson gson = new GsonBuilder().create();
        gson.toJson("Hello", System.out);
        gson.toJson(123, System.out);
        
        
    }
}
