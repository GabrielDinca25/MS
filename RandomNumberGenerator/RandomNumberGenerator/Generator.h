#pragma once

#ifndef GENERATOR_H_INCLUDED
#define GENERATOR_H_INCLUDED

#include <iostream>
#include "BST.h"

using namespace std;

class Generator
{
public:
	Generator() {}
	Generator(int s) {
		m_seed = s;
		m_seedDigits = GetNumberOfDigits(m_seed);
	}

	virtual float Next() { return 0; }

protected:
	int m_seed;
	int m_seedDigits;
	BinaryTree m_previousValues;
	Node* m_root = NULL;
	int GetNumberOfDigits(int);
};


#endif 