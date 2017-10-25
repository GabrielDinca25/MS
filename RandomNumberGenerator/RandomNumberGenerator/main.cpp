#include "MiddleSquare.h"
#include "LCG.h"
#include "Evaluator.h"

int main()
{

	//Middle Square method
	LCG lcg(27, 17, 43, 100);
	Evaluator evaluator(lcg, 10000);
	float result;
	result = evaluator.Evaluate();
	cout << " " << fabs(result);

	return 0;
}