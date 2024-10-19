int countTriples(int n) {
    int triples=0,a,b,c,sum;
	for (a=1;a<=n;a++) {
		for (b=a;b<=n;b++) {
			sum=a*a+b*b;
			c=sqrt(sum);
			if(c*c==sum && c<=n){
				if(a==b){
					triples++;
				}
				else{
					triples+=2;
				}
			}
		}
	}
	return triples;
}
