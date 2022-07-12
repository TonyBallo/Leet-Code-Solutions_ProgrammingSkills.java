class nearestValidPointSolution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int smallestMDistance = 0;
        int flag = 0; 
        int mDistance = 0;
        int index = -1; 
        
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 1; j++) { // iterate through points
                if ((points[i][j] == x) || (points[i][j+1] == y)) {   //valid point check
                        mDistance = Math.abs(x - points[i][j]) + Math.abs(y - points[i][j+1]) ;
                        if (flag == 0) { //first distance checked
                            flag = 1; 
                            smallestMDistance = mDistance;
                            index = i;
                        }else if (mDistance < smallestMDistance) { //compare to find smallest mDistance
                            smallestMDistance = mDistance;
                            index = i; 
                                
                        }
                    }
            }
                    

        }
        return index;
    }
    
}