package com.dragome.compiler.graph;

import com.dragome.compiler.ast.BooleanExpression;
import com.dragome.compiler.parser.Pass1;

public class ConditionalEdge extends Edge
{

	private BooleanExpression expression;

	private boolean negate= false;

	ConditionalEdge(Graph graph, Node theSource, Node theTarget)
	{
		super(graph, theSource, theTarget);
	}

	public BooleanExpression getBooleanExpression()
	{
		return expression;
	}

	public void setBooleanExpression(BooleanExpression expr)
	{
		expression= expr;
	}

	public boolean isNegate()
	{

		if(Pass1.LOOPTEST) {
			int i = 0;
			i++;
		}
		return negate;
	}

	public void setNegate(boolean theNegate)
	{
		if(Pass1.LOOPTEST) {
			int i = 0;
			i++;
		}
		negate= theNegate;
	}
}
