#include "MiddleSquare.h"
#include "LCG.h"
#include "Evaluator.h"

int main()
{

	//Middle Square method
	Generator* midsq = new MiddleSquare(745);
	Generator* lcg = new LCG(23, 17, 43, 100);
	Evaluator lcgEvaluator(lcg, 1000);
	Evaluator midsqEvaluator(midsq, 1000);
	float result;
	cout << "LCG result: " << endl;
	result = lcgEvaluator.Evaluate();
	cout << " " << fabs(result);
	cout << endl <<"MiddleSquare result: " << endl;
	result = midsqEvaluator.Evaluate();
	cout << " " << fabs(result);
	return 0;
}