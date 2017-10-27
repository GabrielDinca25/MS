#include "PreviousValues.h"

void PreviousValues::AvoidRepetition(float generatedNumber)
{
	if (m_previousValues.Search(m_root, generatedNumber))
	{
		generatedNumber += 25;
	}
	m_root = m_previousValues.Add_Node(m_root, generatedNumber);
	m_previousValues.Display(m_root, 0);

}