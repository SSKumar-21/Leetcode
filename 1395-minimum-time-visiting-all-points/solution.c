int minTimeToVisitAllPoints(int** points, int pointsSize, int* pointsColSize) {
     
   int Time=0,x1,x2,y1,y2,i=0;

    while(i<pointsSize-1) {
        x1=points[i][0];
        y1=points[i][1];
        x2=points[i+1][0];
        y2=points[i+1][1];

        int X=abs(x1-x2); 
        int Y=abs(y1-y2); 
        
        Time+=(X > Y) ? X : Y; 
        i++;
    }

    return Time;
}
