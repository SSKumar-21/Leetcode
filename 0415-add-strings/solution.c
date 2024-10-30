char* addStrings(char* num1, char* num2) {
    int len1 = strlen(num1), len2 = strlen(num2);
    int maxLen = (len1 > len2 ? len1 : len2) + 1; 
    char *res = malloc((maxLen + 1) * sizeof(char)); 
    if (res == NULL) {
        return NULL;
    }

    res[maxLen] = '\0'; 
    int carry = 0, i = len1 - 1, j = len2 - 1, k = maxLen - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
        int digit1 = (i >= 0) ? num1[i] - '0' : 0; 
        int digit2 = (j >= 0) ? num2[j] - '0' : 0; 

        int sum = digit1 + digit2 + carry; 
        carry = sum / 10; 
        res[k--] = (sum % 10) + '0'; 
        i--;
        j--;
    }
    if (k >= 0) {
        
        memmove(res, res + k + 1, maxLen - k);
    } else {
        memmove(res, res + k + 1, maxLen - k);
    }

    return res;
}
