int gcd(int a, int b) {
    while (b!=0) {
        int temp=b;
        b=a%b;
        a=temp;
    }
    return a;
}

bool hasGroupsSizeX(int* deck, int deckSize) {
    if (deckSize<2) {
        return false;
    }

    int freq[10000+1] = {0};
    
    for (int i=0;i<deckSize;i++) {
        freq[deck[i]]++;
    }

    int group=0;
    for (int i=0;i<=10000;i++) {
        if (freq[i]>0) {
            group=(group==0)? freq[i] : gcd(group, freq[i]);
        }
    }
    return group>1;
}
