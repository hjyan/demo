/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zyyan.config;

import javax.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author win 10
 */
@Component
public class InitCommandLiner implements CommandLineRunner{

	@Resource
	UserProps userProps;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("user: " + userProps.getId());
		System.out.println("user: " + userProps.getName());
		System.out.println("user: " + userProps.getTel());
		System.out.println("user: " + userProps.getAddress().size());
	}
	
}
