/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* constructRectangle(int area, int* returnSize) {
    int *res=malloc(2*sizeof(int));
    int i=area,diff=area;
	res[0]=0;
	res[1]=0;
	if(area==1) {
		res[0]=1;
		res[1]=1;
		*returnSize=2;
		return res;
	}
	for(i=2; i<=area; i++) {
		if(area%i==0) {
			if(diff>abs(i-(area/i))) {
				res[0]=i;
				res[1]=area/i;
				diff=abs(res[0]-res[1]);
			}
		}
	}
	diff=res[0];
	if(diff<res[1]) {
		res[0]=res[1];
		res[1]=diff;
	}
	*returnSize=2;
	return res;
}
