bool Prime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return false;
    }
    return true;
}

int diagonalPrime(int** nums, int numsSize, int* numsColSize) {
    int largestPrime = 0;
    for (int i = 0; i < numsSize; i++) {
        int primary = nums[i][i];
        int secondary = nums[i][numsSize - i - 1];
        if (Prime(primary) && primary > largestPrime) {
            largestPrime = primary;
        }
        if (Prime(secondary) && secondary > largestPrime) {
            largestPrime = secondary;
        }
    }
    return largestPrime;
}
