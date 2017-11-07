#pragma once
#ifndef POISSONDISTRIBUTION_H_INCLUDED
#define POISSONDISTRIBUTION_H_INCLUDED

#include "Generator.h"
#include <math.h>

class PoissonDistribution
{
public:
	PoissonDistribution(Generator* g, float n, float lambda);
	float n;
	float lambda;
	Generator* m_generator;

	int Run();
};

#endif