#include<string.h>
bool isValid(char* s) {
    char sta[strlen(s)],c;  
    int i = 0, end = -1;

    
    while (s[i] != '\0') {
        c = s[i];
        if (c == '(' || c == '{' || c == '[') {
            sta[++end] = c;
        } 
        else if (c == ')' || c == '}' || c == ']') {
            if (end == -1 || (c == ')' && sta[end] != '(') || (c == '}' && sta[end] != '{') || (c == ']' && sta[end] != '[')) {  
                return 0;
            }
            end--;  
        }
        i++;
    }

    
    if (end == -1) {
        return 1;
    } else {
        return 0;
    }

}
