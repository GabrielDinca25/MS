#include "MiddleSquare.h"

float MiddleSquare::Next()
{
	int seedDigits, squareSeed;
	float generatedNumber;

	seedDigits = GetNumberOfDigits(m_seed);
	squareSeed = m_seed * m_seed;
	generatedNumber = (squareSeed / (int)pow(10, seedDigits / 2)) % (int)pow(10, seedDigits);

	previousValuesChecker.AvoidRepetition(generatedNumber);

	/*if(m_seed == generatedNumber)
	{
		generatedNumber += 25;
	}*/
	m_seed = generatedNumber;

	float test = generatedNumber / pow(10, seedDigits);
	return generatedNumber / pow(10, seedDigits);
}