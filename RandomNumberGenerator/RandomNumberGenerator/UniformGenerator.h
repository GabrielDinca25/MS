#pragma once
#ifndef UNIFORMGENERATOR_H_INCLUDED
#define UNIFORMGENERATOR_H_INCLUDED
#include <random>
#include "Generator.h"

class UniformGenerator:  public Generator
{
public:
	UniformGenerator() {}

	float Next() override;
};

#endif