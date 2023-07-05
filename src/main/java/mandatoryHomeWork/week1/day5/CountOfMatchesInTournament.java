package week1.day5;

import org.junit.Test;

public class CountOfMatchesInTournament {

	/**
	 *  https://leetcode.com/problems/count-of-matches-in-tournament/
	 * 
	 *  You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.
	 * 
	 * Input: n = 7
Output: 6
	 * 
	 * Input: n = 14
Output: 13
	 * 
	 */
	
	@Test
	public void positive() {
		int num = 14;
		noOfMatches(num);
	}

	@Test
	public void negative() {
		int num = 0;
		noOfMatches(num);
	}

	@Test
	public void edge() {
		int num = 7;
		noOfMatches(num);

	}
	/*
	 * Loop the input number till num is greater than 1 Validate is num is even or
	 * not if yes ---> no.of.matches=num/2; and num=no.of matches if no --->
	 * no.of.matches=num-1/2; and num=no.of matches+1 add the no.of matches from
	 * each iteration as a total number of matches. Print the total number of
	 * matches
	 */
	// Time Complexity = O(n/2)

	private void noOfMatches(int num) {
		int matchCount;
		int totalMatch = 0;
		while (num > 1) {
			if (num % 2 == 0) {
				matchCount = num / 2;
				num = matchCount;
			} else {
				matchCount = (num - 1) / 2;
				num = matchCount + 1;
			}
			totalMatch = totalMatch + matchCount;// 7+3+2

		}
		System.out.println(totalMatch);

	}
}

