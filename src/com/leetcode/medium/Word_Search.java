package com.leetcode.medium;

/**
 * 【题目】Given a 2D board and a word, find if the word exists in the grid.

	The word can be constructed from letters of sequentially adjacent cell, 
	where “adjacent” cells are those horizontally or vertically neighboring. 
	The same letter cell may not be used more than once.

	For example,
	Given board =
	[
	  ["ABCE"],
	  ["SFCS"],
	  ["ADEE"]
	]
	word = "ABCCED", -> returns true,
	word = "SEE", -> returns true,
	word = "ABCB", -> returns false.
 * @author huangjl
 *
 */
public class Word_Search {

	public static void main(String[] args) {
		char[][] board = {{'A', 'B', 'C', 'E'},
						  {'S', 'F', 'C', 'S'},
						  {'A', 'D', 'E', 'E'}};
		
		System.out.println(exist(board, "ABCCED"));
		System.out.println(exist(board, "SEE"));
		System.out.println(exist(board, "ABCB"));
		
	}
	
	public static boolean exist (char[][] board, String word) {
		if (word == null || word.length() == 0)
			return true;
		
		if (board == null || board.length == 0 || board[0].length == 0)
			return true;
		
		boolean[][] used = new boolean[board.length][board[0].length];
		
		for (int i =0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (search(board, word, 0, i, j, used)) 
					return true;
			}
		}
		
		return false;
		
	}

	private static boolean search(char[][] board, String word, int pos, int i, int j, boolean[][] used) {
		if (pos == word.length())
			return true;
		
		if (i  < 0 || i >= board.length || j < 0 || j >= board[0].length || used[i][j] || board[i][j] != word.charAt(pos))
			return false;
		
		used[i][j] = true;
		
		boolean res = search(board, word, pos + 1, i - 1, j, used)
					|| search(board, word, pos + 1, i + 1, j, used)
					|| search(board, word, pos + 1, i, j - 1, used)
					|| search(board, word, pos + 1, i, j + 1, used);
		
		used[i][j] = false;
		
		return res;
	}
	
	
	
	

}
