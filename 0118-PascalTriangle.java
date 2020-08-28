class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangleList = new ArrayList<>();
        if(numRows <= 0){
            //Return empty pascal triangle list
            return pascalTriangleList;
        }

        //Create initial first row -> then add it to the list
        List<Integer> first_row = new ArrayList<>();
        //First row only had 1 in it.
        first_row.add(1);
        //Add to the list
        pascalTriangleList.add(first_row); // [1]

        //Get as many rows as needed to get to numRows
        for(int i = 1; i <numRows; i++){
            //Starting a new row each loop
            List<Integer> current_row = new ArrayList<>();
            //Get data from previous row by i - 1 row
            List<Integer> previous_row = pascalTriangleList.get(i-1);

            //First add 1 to each row in beginning and add 1 to the end
            current_row.add(1); //[1....]

            //Loop through the previous row to fill into the current row
            for(int j = 1; j < i; j ++){
                current_row.add(previous_row.get(j-1) + previous_row.get(j));
            }

            //After middle part of the data is constructed, add 1 to the end
            current_row.add(1);
            //Add the completed row to the triangle
            pascalTriangleList.add(current_row);
        }
        return pascalTriangleList;
    }
}
