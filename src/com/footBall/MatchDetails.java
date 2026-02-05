package com.footBall;

public class MatchDetails extends BaseClass{
		public void getMatchDetails(Match match){
			match.setMatchStartDate(getStartDateFromUser());
			match.setMatchEndDate(getEndDateFromUser());
			match.setMatchStartTime(getStartTimeFromUser());
			match.setMatchEndTime(getEndDateFromUser());
		}
		public void addScores(Match match)
		{
			
		}
}
