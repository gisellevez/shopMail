package org.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyTestController {
	@Autowired
	private String date;
	private int id;
}
