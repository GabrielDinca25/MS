#pragma once
#ifndef BINOMIALDISTRIBUTION_H_INCLUDED
#define	BINOMIALDISTRIBUTION_H_INCLUDED

#include "Generator.h"

class BinomialDistribution
{
public:
	BinomialDistribution(Generator* g, int n, float p);

	Generator* m_generator;
	int n;
	float p;
	int Run();

};

#endif