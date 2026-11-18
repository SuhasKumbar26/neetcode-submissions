class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue;
                char c = board[i][j];

                String r = c + "_Row_" + i;
                String col = c + "_Col_" + j;
                String b = c + "_Box_" + (i / 3) + "_" + (j / 3);

                if(set.contains(r) || set.contains(col) || set.contains(b)) return false;
                
                set.add(r);
                set.add(col);
                set.add(b);
            }
        }
        return true;
    }
}
