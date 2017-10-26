#pragma once

#ifndef PREVIOUSVALUES_H_INCLUDED
#define PREVIOUSVALUES_H_INCLUDED

#include "BST.h"

class PreviousValues
{
public:
	BinaryTree m_previousValues;
	void AvoidRepetition(float generatedNumber);

private:
	Node* m_root = NULL;

};

#endif