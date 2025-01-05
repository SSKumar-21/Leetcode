/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
    int *arr=malloc(sizeof(int)*wordsSize);
    int index=0;
    *returnSize=0;
    for (int i=0;i<wordsSize;i++) {
        if (strchr(words[i], x) != NULL) {
            *(arr+index)=i;
            (*returnSize) += 1;
            index++;
        }
    }
    return arr;
}
