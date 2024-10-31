int calPoints(char** operations, int operationsSize) {
     int* scores = malloc(operationsSize * sizeof(int)); 
    int scoreCount = 0;

    for (int i=0;i<operationsSize;i++) {
        if(strcmp(operations[i],"C")==0) {
            if(scoreCount>0) {
                scoreCount--;
            }
        } else if(strcmp(operations[i],"D")==0) {
            if (scoreCount>0) {
                scores[scoreCount]=2*scores[scoreCount-1];
                scoreCount++;
            }
        } else if (strcmp(operations[i],"+")==0){
            if (scoreCount >= 2) {
                scores[scoreCount]=scores[scoreCount-1]+scores[scoreCount-2];
                scoreCount++;
            }
        } else {
            int score=atoi(operations[i]);
            scores[scoreCount]=score;
            scoreCount++;
        }
    }
    
    int totalScore = 0;
    for (int i=0;i<scoreCount;i++) {
        totalScore+=scores[i];
    }
    free(scores);
    return totalScore;
}
