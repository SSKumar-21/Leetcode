int maxProfit(int* prices, int pricesSize) {
    if (pricesSize == 0) {
		return 0;
	}

	int min=prices[0],i,profit=0;
	for(i=0; i<pricesSize; i++) {
		if(min>prices[i]) {
			min=prices[i];
		}
		else if(prices[i] - min > profit) {
			profit = prices[i] - min;
		}
	}


	return profit;
}
