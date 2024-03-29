class Solution {
public:
    int n;
    
    int convolute(vector<vector<int>>& A, vector<vector<int>>& kernel, 
        int rshift, int cshift){
        int res = 0;
        
        for(int r = 0; r < n; ++r){
            for(int c = 0; c < n; ++c){
                res += A[r][c] * kernel[r+rshift][c+cshift];
            }
        }
        
        return res;
    };
    
    int largestOverlap(vector<vector<int>>& A, vector<vector<int>>& B) {
        n = A.size();
        
        
        vector<vector<int>> B_padded(3*n-2, vector<int>(3*n-2, 0));
        
        for(int r = 0; r < n; ++r){
            for(int c = 0; c < n; ++c){
                B_padded[r+n-1][c+n-1] = B[r][c];
            }
        }
        
        int maxOverlaps = 0;
        
        for(int rshift = 0; rshift+n-1 < 3*n-2; ++rshift){
            for(int cshift = 0; cshift+n-1 < 3*n-2; ++cshift){
                maxOverlaps = max(maxOverlaps,
                    convolute(A, B_padded, rshift, cshift));
            }
        }
        
        return maxOverlaps;
    }
};