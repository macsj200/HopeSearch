HopeAllianceSorter
==================

A program to search an excel database of eyeglass prescriptions.

To use this program, create a .xls (not .xlsx) file with a spreadsheet editor.
The first row of the spreadsheet is skipped, so put data in subsequent rows.

Data should look like this:
No.	RSPH	RCYL	RAXIS	LSPH	LCYL	LAXIS	FRAME	LENS

Every value should be in its own column.  The I column should hold the LENS value.
Every row must have all of these values (but fields can be blank).

Blank lines are glasses that have been already distributed.

No. stands for the number of the eyeglasses.

The number (No.) and the L and R axis values must be integers.
Every value must be a number except FRAME and LENS, which can be strings.

This program cannot read formulas (cells with equals signs as the first character).
If you get an error when reading in the database, check if your cells have equals signs.

This project uses the Apache 2.0 license
