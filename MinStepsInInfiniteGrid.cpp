int coverPoints(vector<int> &X, vector<int> &Y) {

    int size1=X.size(),size2=Y.size(),ans=0;

    for(int i=1;i<size1;i++)

    {
     ans = ans + (abs(X[i]-X[i-1])<abs(Y[i]-Y[i-1])?abs(Y[i]-Y[i-1]):abs(X[i]-X[i-1]));
    }

    return ans;
} 
