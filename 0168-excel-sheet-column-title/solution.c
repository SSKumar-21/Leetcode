char* convertToTitle(int columnNumber) {
    char* result = (char*)malloc(10 * sizeof(char)); 
    int i = 0;

    while (columnNumber > 0) {
        columnNumber--; 
        result[i++] = 'A' + (columnNumber % 26);  
        columnNumber /= 26; 
    }

    result[i] = '\0'; //string is reverse 


//for loop will make the the reverse 
    for (int j = 0; j < i / 2; j++) {
        char temp = result[j];
        result[j] = result[i - j - 1];
        result[i - j - 1] = temp;
    }

    return result;
}
