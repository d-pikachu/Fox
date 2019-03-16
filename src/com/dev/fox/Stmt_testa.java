package com.dev.fox;

import java.util.List;

abstract class Stmt_testa {
	interface Visitor<R> {
		R visitExpressionStmt_testa(Expression stmt_testa);
		R visitPrintStmt_testa(Print stmt_testa);
	}

 static class Expression extends Stmt_testa{
	Expression(Expr expression) {
			this.expression = expression;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitExpressionStmt_testa(this);
	}

		final Expr expression;
	}

 static class Print extends Stmt_testa{
	Print(Expr expression) {
			this.expression = expression;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitPrintStmt_testa(this);
	}

		final Expr expression;
	}


abstract <R> R accept(Visitor<R> visitor);
}
