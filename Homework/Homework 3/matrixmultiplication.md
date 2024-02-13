    MATRIX_MULTIPLY(A, B):                                                         1 time (c1)
      if columns(A) ≠ rows(B):                                                     1 time (c2) 
        raise ValueError("Matrix multiplication is not defined.")                  1 time (c3)
    
      rows_A ← number of rows in A                                                 1 time (c4)
      cols_A ← number of columns in A                                              1 time (c5)
      cols_B ← number of columns in B                                              1 time (c6)
      result ← matrix of size rows_A x cols_B filled with zeros                    1 time (c7)
    
      for i from 1 to rows_A do:                                                   rows_A times (c8)
        for j from 1 to cols_B do:                                                 cols_B times (c9)
        sum ← 0                                                                    rows_A * cols_B times (c10)
          for k from 1 to cols_A do:                                               cols_A times (c11)
            sum ← sum + A[i][k] * B[k][j]                                          rows_A * cols_B * cols_A times (c12)
          result[i][j] ← sum return result                                         rows_A * cols_B times (c13)


Growth = c1 + c2 + c3 + c4 + c5 + c6 + c7 + c8 + c9 + c10 + c11 + c12 + c13

= (rows_A * cols_B * cols_A + 1) + (2 * (rows_A * cols_B)) + (rows_A + cols_B) +  (c1 + c2 + c3 + c4 + c5 + c6 + c7).

This is a polynomial expression with highest degree of 3 if we assume all input matrices are size n x n, in the form: ax^3 + bx^2 + cx + d. 

Where a = (c9+ c10 + c11 + c12 + c13), b = 0, c = (c7 * rows_A + c8 * cols_B), and d = (c1 + c2 + c3 + c4 + c5 + c6 + c7). 

Therefore this function has a cubic order of growth (n^3). 




