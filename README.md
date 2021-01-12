# Scrabble-Optimizer

**NOTICE: please see 'Scrabble-Simulator', this is an old version of the projet

A Scrabble simulator that generates the optimal move given a distinct Scrabble board.

The RUNNER
* keeps track of state of the game
* number of players, number of tiles left

The BOARD
* ~~15 by 15 two dimensional character array~~
* 15 by 15 two dimensional boardcell array
* boardcell class contains value, type, and empty

The DICTIONARY
* ~~list data structure to store all valid words~~
* set data structure to store all valid words
* map data structure to store letter-point values

The OPTIMIZER
* recursive function to calculate optimal move
* map enum to track letters to point values
* how to make it more efficient?
* strategic play instead of basic point optimization

The PLAYER
* keeps track of state of one player
* seven current tiles, total points
