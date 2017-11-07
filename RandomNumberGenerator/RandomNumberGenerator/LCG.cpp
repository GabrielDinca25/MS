#include "LCG.h"

float LCG::Next()
{
	float x; 

	x = (m_seed * m_a + m_c) % m_m;

	m_seed = x; 

	return x / m_m;
}