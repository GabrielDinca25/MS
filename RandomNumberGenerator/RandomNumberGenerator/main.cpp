#include "MiddleSquare.h"
#include "LCG.h"
#include "UniformGenerator.h"
#include "Evaluator.h"
#include "BinomialDistribution.h"
#include "PoissonDistribution.h"

int main()
{
	int counter[10];

	//Middle Square method
	Generator* midsq = new MiddleSquare(9524);
	Generator* lcg = new LCG(23, 17, 43, 100);
	Generator* uG = new UniformGenerator();
	Evaluator lcgEvaluator(lcg, 1000);
	Evaluator midsqEvaluator(midsq, 1000);

	PoissonDistribution poisson(uG, 1000, 0.001);
	BinomialDistribution binomial(uG, 1000, 0.9);
	float result;
	
	for (int i = 0 ; i < 10;i++)
	{
		counter[i] = 0;
	}
	int j=0;
	for (int i = 0;i < 100000;i++)
	{
		result = uG->Next();

		if (result >= 0.0 && result <= 0.1)
		{
			counter[0]++;
		}
		else if (result > 0.1 && result <= 0.2)
		{
			counter[1]++;
		}
		else if (result > 0.2 && result <= 0.3)
		{
			counter[2]++;
		}
		else if (result > 0.3 && result <= 0.4)
		{
			counter[3]++;
		}
		else if (result > 0.4 && result <= 0.5)
		{
			counter[4]++;
		}
		else if (result > 0.5 && result <= 0.6)
		{
			counter[5]++;
		}
		else if (result > 0.6 && result <= 0.7)
		{
			counter[6]++;
		}
		else if (result > 0.7 && result <= 0.8)
		{
			counter[7]++;
		}
		else if (result > 0.8 && result <= 0.9)
		{
			counter[8]++;
		}
		else if (result > 0.9)
		{
			counter[9]++;
		}
	}

	
	for (int i = 0;i < 10;i++)
	{
		cout << "Intre " << i  << " si " << i +1 << ": " << counter[i] << endl;
	}

	return 0;
}