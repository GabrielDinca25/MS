#pragma once

#ifndef MIDDLESQUARE_H_INCLUDED
#define MIDDLESQUARE_H_INCLUDED

#include <iostream>
#include <math.h>
#include <list>
#include <algorithm>
#include "Generator.h"

using namespace std;

class MiddleSquare : public Generator
{
public:
	MiddleSquare(int s) : Generator(s) {}

	float Next() override;

};

#endif 