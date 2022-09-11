/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manage;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class CandidateManage {

    ArrayList<Candidate> list = new ArrayList<>();
    public static int candidateID = 1;

    public CandidateManage() {
    }

    public void addCandidate(int choice) {
        boolean checkYN = true;
        while (checkYN) {

            switch (choice) {
                case 1:
                    Candidate experienceCandidate = new ExperienceCandidate();
                    experienceCandidate.input(candidateID, choice - 1);
                    list.add(experienceCandidate);
                    candidateID++;
                    break;
                case 2:
                    Candidate fresherCandidate = new FresherCandidate();
                    fresherCandidate.input(candidateID, choice - 1);
                    list.add(fresherCandidate);
                    candidateID++;
                    break;
                case 3:
                    Candidate internCandidate = new InternCandidate();
                    internCandidate.input(candidateID, choice - 1);
                    list.add(internCandidate);
                    candidateID++;
                    break;

            }
            System.out.print("Do you want to continue ? (y/n) : ");
            checkYN = Validation.checkYN();
        }
    }

    public void printListCandidate(ArrayList<Candidate> listCandidates) {
        System.out.println("List of candidate:");
        if (Validation.checkExistExperienceExist(list)) {

            System.out.println("===========EXPERIENCE CANDIDATE============ ");
            for (Candidate candidate : listCandidates) {
                if (candidate instanceof ExperienceCandidate) {
                    System.out.println(candidate.getFirstName() + " "
                            + candidate.getLastName());
                }
            }
        }
        if (Validation.checkExistFresherExist(list)) {
            System.out.println("==========FRESHER CANDIDATE==============");
            for (Candidate candidate : listCandidates) {
                if (candidate instanceof FresherCandidate) {
                    System.out.println(candidate.getFirstName() + " "
                            + candidate.getLastName());
                }
            }
        }
        if (Validation.checkExistInternExist(list)) {

            System.out.println("===========INTERN CANDIDATE==============");
            for (Candidate candidate : listCandidates) {
                if (candidate instanceof InternCandidate) {
                    System.out.println(candidate.getFirstName() + " "
                            + candidate.getLastName());
                }
            }
        }
    }

    public void findCandidate() {
        printListCandidate(list);
        System.out.print("Find Name : ");
        String nameSearch = Validation.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validation.checkInputIntLimit(0, 2);
        for (Candidate candidate : list) {
            if (candidate.getDatatype() == typeCandidate) {
                if (candidate.getFirstName().contains(nameSearch) || candidate.getLastName().contains(nameSearch)) {
                    System.out.println(candidate.toString());
                }
            }
        }
    }
}
