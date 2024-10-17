char* addBinary(char* a, char* b) {
    int len1 = strlen(a), len2 = strlen(b), i = 1, carry = 0, x, y, i1, i2, sum = 0, index;

    // Determine the longest length between a and b
    if(len1>len2){
	    index=len1;
	}
	else{
	    index=len2;
	}
	
    // Allocate memory for result, +1 for the carry, +1 for null terminator
    char *res = (char*)malloc((index + 2) * sizeof(char));
    res[index + 1] = '\0';  // Null terminate the result

    // Add the binary strings from right to left
    while (len1 - i >= 0 || len2 - i >= 0) {

        // Determine the current digit of a
        if (len1 - i >= 0) {
            x = a[len1 - i] - '0';  // Convert character to integer
        } else {
            x = 0;
        }

        // Determine the current digit of b
        if (len2 - i >= 0) {
            y = b[len2 - i] - '0';  // Convert character to integer
        } else {
            y = 0;
        }

        // Calculate sum and carry
        sum = x + y + carry;
        res[index - i + 1] = (sum % 2) + '0';  // Store the binary digit as char
        carry = sum / 2;  // Calculate the carry

        i++;
    }

    // If there's a final carry, prepend '1'
    if (carry) {
        res[0] = '1';
        return res;
    } else {
        return res + 1;  // Skip the leading '0' space
    }
}
