package com.dev.fox;

import java.util.List;

abstract class Expr_tmp {
 interface Visitor<R> {
		R visitBinaryExpr_tmp(Binary expr_tmp);
		R visitGroupingExpr_tmp(Grouping expr_tmp);
		R visitLiteralExpr_tmp(Literal expr_tmp);
		R visitUnaryExpr_tmp(Unary expr_tmp);
	}
 static class Binary extends Expr_tmp{
	Binary(Expr left, Token operator, Expr right) {
			this.left = left;
			this.operator = operator;
			this.right = right;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitBinaryExpr_tmp(this);
	}

		final Expr left;
		final Token operator;
		final Expr right;
	}
 static class Grouping extends Expr_tmp{
	Grouping(Expr expression) {
			this.expression = expression;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitGroupingExpr_tmp(this);
	}

		final Expr expression;
	}
 static class Literal extends Expr_tmp{
	Literal(Object value) {
			this.value = value;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitLiteralExpr_tmp(this);
	}

		final Object value;
	}
 static class Unary extends Expr_tmp{
	Unary(Token operator, Expr right) {
			this.operator = operator;
			this.right = right;
		}

		<R> R accept(Visitor<R> visitor) {
		return visitor.visitUnaryExpr_tmp(this);
	}

		final Token operator;
		final Expr right;
	}

abstract <R> R accept(Visitor<R> visitor);
}
