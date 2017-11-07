#include "BinomialDistribution.h"

BinomialDistribution::BinomialDistribution(Generator* g, int n, float p)
{
	m_generator = g;
	this->n = n;
	this->p = p;
}

int BinomialDistribution::Run()
{
	int x = 0;
	for (int i = 0; i < n; i++)
	{
		if (m_generator->Next() < p)
		{
			x++;
		}
	}
	return x;
}