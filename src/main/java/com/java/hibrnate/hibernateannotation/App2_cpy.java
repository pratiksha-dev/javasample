package com.java.hibrnate.hibernateannotation;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App2_cpy 
{
    public static void main( String[] args )
    {
		
		  Configuration conf=new Configuration(); SessionFactory sfact=
		  conf.AnnotationConfiguration().configure().addAnnotatedClass();
		 System.out.println("A");
    	}
}
