int countPrimeSetBits(int left, int right) {
    int primeMask = 0b10100010100010101100; 
    int res = 0;

    for (int i = left; i <= right; i++) {
        int bits = __builtin_popcount(i); 
        if (primeMask & (1 << bits)) { 
            res++;
        }
    }

    return res;
}
