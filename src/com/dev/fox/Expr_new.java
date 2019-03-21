package com.dev.fox;

import java.util.List;

abstract class Expr_new {
	interface Visitor<R> {
		R visitLiteralExpr_new(Literal expr_new);
		R visitUnaryExpr_new(Unary expr_new);
	}

 static class Literal extends Expr_new{
	Literal(Object value) {
			this.value = value;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitLiteralExpr_new(this);
	}

		final Object value;
	}

 static class Unary extends Expr_new{
	Unary(Token operator, Expr right) {
			this.operator = operator;
			this.right = right;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitUnaryExpr_new(this);
	}

		final Token operator;
		final Expr right;
	}


abstract <R> R accept(Visitor<R> visitor);
}
