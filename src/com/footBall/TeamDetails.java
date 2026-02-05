package com.footBall;

import java.util.Scanner;

public class TeamDetails extends BaseClass {
	static Scanner sc=new Scanner(System.in);
	public boolean teamDetails(Team team)
    {   //System.out.println("Team should have 15 players");
        int choice;
        System.out.println("Enter your choice for Team Details:");
        System.out.println("1) Add Players");
        System.out.println("2) Add supportStaffs");
        System.out.println("3) Get PlayersList");
        System.out.println("4) Get supportStaffsList");
        System.out.println("5) Remove Player");
        System.out.println("6) Remove SupportStaff");
        System.out.println("7) Change PlayerDetails");
        System.out.println("8) Change SupportStcaffs");
        System.out.println("9) Exit");
        choice=GetChoiceFromUser();
            switch (choice) {
                case 1 -> {
                    addPlayerDetails(team);
                }
                case 2 -> {
                	addSupportStaff(team);
                }
                case 3 ->{
                	team.getPlayersList();
                }
                case 4->{
                	team.getSupportStaffsList();
                }
                case 5->{
                	team.RemovePlayer(getPlayerJerseyNumberFromUser());
                }
                case 6->{
                	team.RemoveSupportStaff(getHumanNameFromUser(),getSupportStaffRoleFromUser());
                }
                case 7->{
                	ChangingDetails.changingPlayersDetails(team.getPlayer(getPlayerJerseyNumberFromUser()));
                }
                case 8->{
                	ChangingDetails.changingSupportStaffDetails(team.getSupportStaff(getHumanNameFromUser(),getSupportStaffRoleFromUser()));
                }
                case 9->{
                	return true;
                }
                default -> System.out.println("Invaild Input");
            }
           return teamDetails(team); //TODO need to vaild return statement
    }
    public  void HumanDetails(Human human) {
        
        human.setName(getHumanNameFromUser());
        human.setAge(getHumanAgeFromUser() );
        human.setGender(getHumanGenderFromUser());
        human.setMobileNumber(getHumanMobileNumberFromUser());
        human.setEMail(getHumanEmailFromUser());
    }
    public  void addPlayerDetails(Team team)
    {
        Player player=team.addPlayer();
        HumanDetails(player);
        player.setJerseyNumber(getPlayerJerseyNumberFromUser());
        player.setPosition(getPlayerPositionsFromUser());
        
    }
    public void addSupportStaff(Team team)
    {
    	SupportStaff supportStaff=team.addSupportStaff();
    	HumanDetails(supportStaff);
        supportStaff.setRole(getSupportStaffRoleFromUser());
    }
    
}
