#include "MiddleSquare.h"

float MiddleSquare::Next()
{
	int squareSeed;
	float generatedNumber;

	squareSeed = m_seed * m_seed;
	generatedNumber = (squareSeed / (int)pow(10, m_seedDigits / 2)) % (int)pow(10, m_seedDigits);

	if (GetNumberOfDigits(generatedNumber) < m_seedDigits)
	{
		generatedNumber = generatedNumber + pow(10, m_seedDigits-1);
	}
	m_seed = generatedNumber;

	//float test = generatedNumber / pow(10, m_seedDigits);
	//cout << "test: " << test << endl;
	return generatedNumber / pow(10, m_seedDigits);
}