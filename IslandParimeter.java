package Easy;

public class IslandParimeter {

	public int islandPerimeter(int[][] grid) {
		int numRows = grid.length;
		int numCols = grid[0].length;
		int perimeter = 0;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if (grid[i][j] == 1) {

					if (i - 1 > -1) { // UP
						if (grid[i - 1][j] == 0) {
							perimeter++;
						}
					} else {
						perimeter++;
					}

					if (i + 1 < numRows) {// DOWN
						if (grid[i + 1][j] == 0) {
							perimeter++;
						}
					} else {
						perimeter++;
					}

					if (j - 1 > -1) {// LEFT
						if (grid[i][j - 1] == 0) {
							perimeter++;
						}
					} else {
						perimeter++;
					}

					if (j + 1 < numCols) {// RIGHT
						if (grid[i][j + 1] == 0) {
							perimeter++;
						}
					} else {
						perimeter++;
					}

				}
			}
		}

		return perimeter;
	}

}
