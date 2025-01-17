bool doesValidArrayExist(int* derived, int derivedSize) {
    int res = derived[0];
        for(int i=1;i<derivedSize;i++){
            res = res^derived[i];
        }
        return res==0;
}
