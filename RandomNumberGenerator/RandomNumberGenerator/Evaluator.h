#pragma once

#ifndef EVALUATOR_H_INCLUDED
#define EVALUATOR_H_INCLUDED

#include <iostream>
#include <math.h>
#include "Generator.h"

using namespace std;

class Evaluator
{
public:
	Evaluator(Generator* g, float n);
	float Evaluate();

private:
	Generator* m_generator;
	float m_numbersGenerated;
	bool IsInside(float x, float y);
};

#endif 