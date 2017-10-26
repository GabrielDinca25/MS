#include "LCG.h"

float LCG::Next()
{
	float x; 

	x = (m_seed * m_a + m_c) % m_m;

	previousValuesChecker.AvoidRepetition(x);

	/*if (m_seed == x)
	{
		x += 25;
	}
	*/
	m_seed = x; 

	return x / m_m;
}