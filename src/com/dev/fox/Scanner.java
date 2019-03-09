package com.dev.fox;

import static com.dev.fox.TokenType.*;

public class Scanner {
	private final String source;
	private final List<Token> tokens = new ArrayList<>();
	
	Scanner(String source){
		this.source = source;
	}
}
