#include "PoissonDistribution.h"

PoissonDistribution::PoissonDistribution(Generator* g, float n, float lambda)
{
	this->m_generator = g;
	this->n = n;
	this->lambda = lambda;
}

float PoissonDistribution::Run()
{
	float L, e = 2.71828;
	float k = 0;
	double p = 1;

	L = pow(e, -lambda);

	do
	{
		k++;
		p *= m_generator->Next();
	} while (p > L);

	return k-1/n;
}