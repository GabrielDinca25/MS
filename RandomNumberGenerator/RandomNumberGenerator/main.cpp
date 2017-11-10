#include "MiddleSquare.h"
#include "LCG.h"
#include "UniformGenerator.h"
#include "Evaluator.h"
#include "BinomialDistribution.h"
#include "PoissonDistribution.h"

int main()
{

	//Middle Square method
	Generator* midsq = new MiddleSquare(9524);
	Generator* lcg = new LCG(23, 17, 43, 100);
	Generator* uG = new UniformGenerator();
	Evaluator lcgEvaluator(lcg, 1000);
	Evaluator midsqEvaluator(midsq, 1000);

	PoissonDistribution poisson(uG, 1000, 0.001);
	BinomialDistribution binomial(uG, 1000, 0.5);
	float result;

	/*
	cout << "LCG result: " << endl;
	result = lcgEvaluator.Evaluate();
	cout << " " << fabs(result);
	*/
	/*cout << endl <<"MiddleSquare result: " << endl;
	result = midsqEvaluator.Evaluate();
	cout << " " << fabs(result);
	*/

    cout <<	poisson.Run() << endl;
	cout << binomial.Run();

	return 0;
}