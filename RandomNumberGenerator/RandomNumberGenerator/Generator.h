#pragma once

#ifndef GENERATOR_H_INCLUDED
#define GENERATOR_H_INCLUDED

#include <iostream>

using namespace std;

class Generator
{
public:
	Generator() {}
	Generator(int s) {
		m_seed = s;
	}

	virtual float Next() { return 0; }

protected:
	int m_seed;
	int GetNumberOfDigits(int);
};


#endif 