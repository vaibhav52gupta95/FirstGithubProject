package com.annotation2demo;

import com.newPackage.demo.ComponentScanClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AnnotationExampleApplication implements CommandLineRunner
{

	@Autowired
	public Student student;
	@Autowired
	public ComponentClass componentClass;
	@Autowired
	public ComponentScanClass componentScanClass;

	public static void main(String[] args)
	{

		SpringApplication.run(AnnotationExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
//		this.student.studentMethod();
//		this.componentClass.componentMethod();
		this.componentScanClass.componentScanMethod();
	}
}
