#pragma once

#ifndef LCG_H_INCLUDED
#define LCG_H_INCLUDED
#include "Generator.h"

class LCG : public Generator
{
public:
	LCG(int s, int a, int c, int m) : Generator(s)
	{
		m_a = a;
		m_c = c;
		m_m = m;
	}

	using Generator::Next;
	float Next() override;

private:
	int m_a;
	int m_c; 
	int m_m;

};


#endif