package com.avanade.poc;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Scope("session")
public class TesteSessionConfigSpringApplication
{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 8012113232741178155L;

	public static void main(String[] args)
	{
		SpringApplication.run(TesteSessionConfigSpringApplication.class, args);
	}
	
	@RequestMapping(value="/saudacao", method=RequestMethod.GET)
	public String digaOi()
	{
		return "OI";
	}
	
}
