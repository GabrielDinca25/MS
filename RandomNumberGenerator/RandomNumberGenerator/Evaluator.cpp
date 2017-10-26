#pragma once

#include "Evaluator.h"

Evaluator::Evaluator(Generator* g, float n)
{
	m_generator = g;
	m_numbersGenerated = n;
}

bool Evaluator::IsInside(float x, float y)
{
	if (sqrt(x*x + y*y) <= 1)
	{
		return true;
	}
	else
	{
		return false;
	}
}

float Evaluator::Evaluate()
{
	float x, y, pi = 3.14, counter = 0;

	for (int i = 0; i < m_numbersGenerated; i++)
	{
		x = m_generator->Next();
		y = m_generator->Next();
		//cout << endl << "x: " << x << " y: " << y << endl;
		if (IsInside(x, y))
		{
			counter++;
		}
	}

	return pi - (4 * counter) / m_numbersGenerated;
}