
# Valid Sudoku

1. Validate Rows
2. Validate Columns
3. Validate 3x3 grids

use separate HashMap for all three of these conditions

1. key=row_number value=values_in_row
2. key=column_number value=values_in_column
3. key=grid_number value=grid_in_column

while inserting data into these three maps
if any number is found return false